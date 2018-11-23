package cn.fly.yun.config.interceptor;

import cn.fly.yun.config.exceptions.BusinessException;
import cn.fly.yun.handle.RedisHandle;
import cn.fly.yun.utils.SignInterfaceUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.Charset;
import java.util.UUID;

@Component
@Configuration
public class DzSecrityInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(DzSecrityInterceptor.class);

    @Resource
    RedisHandle redisHandle;

    @Resource
    RedisTemplate redisTemplate;

    public DzSecrityInterceptor() {
        super();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String secrityKey="29597a4d964947a4ade83269a8c5e454";

        String body=getBodyString(request);
        logger.info("#######报文体:"+body);
        String mClientId=request.getHeader("M-Client-ID");
        logger.info("####前端上送的mClientId#####"+mClientId);
        String mTimestamp=request.getHeader("M-Timestamp");
        logger.info("####前端上送的mTimestamp#####"+mTimestamp);
        String mRequestId=request.getHeader("M-Request-ID");
        logger.info("####前端上送的mRequestId#####"+mRequestId);
        String mRequestSignature=request.getHeader("M-Request-Signature");
        logger.info("####前端上送的mRequestSignature#####"+mRequestSignature);
        //判断所有的值是否为空，不为空才让继续
        if(!"".equals(mClientId)&&!"".equals(mTimestamp)&&!"".equals(mRequestId)&&!"".equals(mRequestSignature)&&
        null!=mClientId&&null!=mTimestamp &&null!=mRequestId&&null!=mRequestSignature){
            //简单校验，1.timestamp只能在5分钟内有效，2.nonce进来后往redis里面存入数据,如果在timestamp的时间内，
            // redis里面有这个key说明重复交易，没有就往里面插入key，生效时间给5分钟。
            //如果这些校验都通过了，来计算hash吧就成功了。
            if(SignInterfaceUtils.compareTimesSeconds(System.currentTimeMillis(),Long.valueOf(mTimestamp))){
                    if(!redisHandle.exists(mRequestId)) {
//                        String localHash = SignInterfaceUtils.signIn(body,requestUri, timestamp, nonce, secrityKey);
                        String localHash=SignInterfaceUtils.dzSignIn(mClientId,mTimestamp,mRequestId,body,secrityKey);
                        if(mRequestSignature.equals(localHash)){
                            //redis没有数据，插入key,并且同时业务处理
//                            redisHandle.set(nonce, 0, 300L);
                            redisTemplate.opsForValue().set(mRequestId, "0", 300L);
                        }else{
                            throw new BusinessException("10003");
                        }
                    }else{
                        throw new BusinessException("10003");
                    }
            }else{
                throw new BusinessException("10003");
            }
        }else{
            throw new BusinessException("10003");
        }
        return super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }


    /**
     * 获取请求Body
     *
     * @return
     */
    public static String getBodyString(final ServletRequest request) {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = cloneInputStream(request.getInputStream());
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /**
     * Description: 复制输入流</br>
     * @param inputStream
     * @return</br>
     */
    public static InputStream cloneInputStream(ServletInputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buffer)) > -1) {
                byteArrayOutputStream.write(buffer, 0, len);
            }
            byteArrayOutputStream.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
        InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }

    public static void main(String[] args) {
        String uuid= UUID.randomUUID().toString();
        System.out.println(uuid);
    }
}
