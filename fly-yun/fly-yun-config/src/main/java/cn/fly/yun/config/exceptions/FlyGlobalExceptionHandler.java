package cn.fly.yun.config.exceptions;

import cn.fly.yun.config.exceptions.response.*;
import cn.fly.yun.config.utils.ThreadLocalUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;


@ControllerAdvice
@ResponseBody
public class FlyGlobalExceptionHandler {
    private Locale getLocaleByThreadLocal() {
        Locale locale = Locale.SIMPLIFIED_CHINESE;
        String localeStr = ThreadLocalUtils.getLocalLanaguage();
        if (StringUtils.hasText(localeStr)) {
            if ("english".equals(localeStr)) {
                locale = Locale.ENGLISH;
            } else if ("japan".equals(localeStr)) {
                locale = Locale.JAPAN;
            } else if ("korea".equals(localeStr)) {
                locale = Locale.KOREA;
            }
        }
        return locale;
    }

    private static final Logger logger = LoggerFactory.getLogger(FlyGlobalExceptionHandler.class);


    /**
     * 未捕获异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        e.printStackTrace();
        logger.error("==============================ExceptionMapperSupport============================", e);
        FlyErrorResponse errorResponse = new FlyUncaughtExceptionResponse(000001,getLocaleByThreadLocal(), e);
        return errorResponse;
    }

    /**
     * 请求参数异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public FlyErrorResponse handleException(MethodArgumentNotValidException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        FlyErrorResponse errorResponse = new MethodArgumentNotValidResponse(000002,getLocaleByThreadLocal(), e);
        return errorResponse;
    }


    /**
     * 自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public FlyErrorResponse handleException(BusinessException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        FlyErrorResponse errorResponse = new FlyBusinessErrorResponse(Integer.parseInt(e.getCode()),getLocaleByThreadLocal(), e);
        return errorResponse;
    }
}
