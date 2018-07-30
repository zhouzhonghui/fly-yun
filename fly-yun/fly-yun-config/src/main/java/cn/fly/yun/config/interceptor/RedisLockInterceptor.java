package cn.fly.yun.config.interceptor;

import cn.fly.yun.base.BaseReq;
import cn.fly.yun.base.TransLog;
import cn.fly.yun.config.annotations.RedisLock;
import cn.fly.yun.config.exceptions.BusinessException;
import cn.fly.yun.config.utils.DesEncrypt;
import cn.fly.yun.config.utils.RequestJsonUtils;
import cn.fly.yun.config.utils.ThreadLocalUtils;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.shiro.util.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class RedisLockInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(RedisLockInterceptor.class);

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 定义拦截规则：拦截com.boot.dubbo.controller包下面的所有类中，有@RedisLock注解的方法。 
     */
//    @Pointcut("execution(* cn.fly.yun.client.controller..*(..)) && @annotation(cn.fly.yun.config.annotations.RedisLock)")
    @Pointcut("@annotation(cn.fly.yun.config.annotations.RedisLock)")
    public void RedisLockPointcut() {
    }

    /**
     * 拦截器实现
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("RedisLockPointcut()")
    public Object Interceptor(ProceedingJoinPoint point) throws Throwable {
        Object[] objects = point.getArgs();
        MethodSignature methodSignature = (MethodSignature) point.getSignature();

        String value = methodSignature.getMethod().getDeclaredAnnotation(RedisLock.class).value();
        String[] params = methodSignature.getMethod().getDeclaredAnnotation(RedisLock.class).params();
        long timeOut = methodSignature.getMethod().getDeclaredAnnotation(RedisLock.class).timeOut();
        TimeUnit timeUnit = methodSignature.getMethod().getDeclaredAnnotation(RedisLock.class).timeUnit();


        for (Object o : objects) {
            if (o instanceof BaseReq) {
                String jsonStr = JSON.toJSONString(o);
                logger.info("getRequestPayload：{}", jsonStr);
                String needLockKey = "redislock:";
                needLockKey += value;
                if (!StringUtils.hasText(value)) {
                    needLockKey += paramsJsonMd5(jsonStr);
                } else {

                    for (String param : params) {
                        needLockKey += RequestJsonUtils.getParameter(jsonStr, param) + "_";
                    }
                }


                if (StringUtils.hasText(needLockKey)) {
                    logger.info("redis分布式锁开始,key值：{}", needLockKey);
                    if (redisTemplate.hasKey(needLockKey)) {
                        logger.info("redis分布式锁开始key值已存在,key值：{}", needLockKey);
                        throw new BusinessException("repeat.submit.error");
                    }

                    Boolean ok = redisTemplate.opsForValue().setIfAbsent(needLockKey, "OK");
                    if (!ok) {
                        logger.info("redis分布式锁开始key值已存在,key值：{}", needLockKey);
                        throw new BusinessException("repeat.submit.error");
                    }
                    redisTemplate.expire(needLockKey, timeOut, timeUnit);
                    logger.info("redis分布式锁结束,key值：{}", needLockKey);
                }

            }


        }
        return point.proceed();
    }


    private String paramsJsonMd5(String json) throws Exception {

        logger.info("params:{}", json);
        return DesEncrypt.getMd5(json);
    }
}
