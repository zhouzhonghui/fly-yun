package cn.fly.yun.config.interceptor;


import cn.fly.yun.base.BaseReq;
import cn.fly.yun.base.TransLog;
import cn.fly.yun.config.utils.ThreadLocalUtils;
import com.alibaba.fastjson.JSON;
import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Aspect
@Component
public class ControllerInterceptor {

    /**
     * 定义拦截规则：拦截com.boot.dubbo.controller包下面的所有类中，有@RequestMapping注解的方法。 
     */
    @Pointcut("execution(* cn.fly.yun.client.controller..*(..)) and @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerMethodPointcut() {
    }

    /**
     * 拦截器实现
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("controllerMethodPointcut()")
    public Object Interceptor(ProceedingJoinPoint point) throws Throwable {
        Object[] objects = point.getArgs();
        TransLog transLog = ThreadLocalUtils.getLocalTranslog();
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        String transName = methodSignature.getMethod().getDeclaredAnnotation(RequestMapping.class).name();


        for (Object o : objects) {
            if (o instanceof BaseReq) {
                BaseReq baseReq = (BaseReq) o;
                BeanUtils.copyProperties(baseReq, transLog);
                System.out.println(baseReq);
            }
        }

        Object result = point.proceed();


        transLog.setResponseData(JSON.toJSONString(result));
        transLog.setTransName(transName);
        ThreadLocalUtils.setLocalTranslog(transLog);
        return result;
    }
}
