package cn.fly.yun.config.interceptor;

import cn.fly.yun.handle.RedisHandle;
import cn.fly.yun.utils.SignInterfaceUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
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

@Component
@Configuration
public class SecrityInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SecrityInterceptor.class);

    @Resource
    RedisHandle redisHandle;

//    public SecrityInterceptor() {
//        super();
//    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String secrityKey="fdac2951b67e4b82a3a798a520e1c687";
        String body = getBodyString(request);
        logger.info("####前端上送的整个报文体#####"+body);
        String requestUri=request.getRequestURI();
        logger.info("####前端上送的requestUri#####"+requestUri);
        String timestamp=request.getHeader("timestamp");
        logger.info("####前端上送的timestamp#####"+timestamp);
        String nonce=request.getHeader("nonce");
        logger.info("####前端上送的nonce#####"+nonce);
        String hash=request.getHeader("hash");
        logger.info("####前端上送的Hash#####"+hash);
        //判断所有的值是否为空，不为空才让继续
        if(!"".equals(body)&&!"".equals(requestUri)&&!"".equals(timestamp)&&!"".equals(nonce)&&!"".equals(hash)){
            //简单校验，1.timestamp只能在5分钟内有效，2.nonce进来后往redis里面存入数据,如果在timestamp的时间内，
            // redis里面有这个key说明重复交易，没有就往里面插入key，生效时间给5分钟。
            //如果这些校验都通过了，来计算hash吧就成功了。
            if(Long.valueOf(timestamp) < System.currentTimeMillis()){
                if(SignInterfaceUtils.compareTimesSeconds(System.currentTimeMillis(),Long.valueOf(timestamp))){
                    if(!redisHandle.exists(nonce)) {
                        String localHash = SignInterfaceUtils.signIn(body, requestUri, timestamp, nonce, secrityKey);
                        if(hash.equals(localHash)){
                            //redis没有数据，插入key,并且同时业务处理
                            redisHandle.set(nonce, 0, 300L);
                        }else{
                            response.setHeader("Content-type", "text/html;charset=UTF-8");
                            response.getWriter().write("非法请求");
                        }
                    }else{
                        response.setHeader("Content-type", "text/html;charset=UTF-8");
                        response.getWriter().write("非法请求");
                    }
                }
            }else{
                response.setHeader("Content-type", "text/html;charset=UTF-8");
                response.getWriter().write("非法请求");
            }
        }else{
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            response.getWriter().write("非法请求");
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
     * @param request
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

}
