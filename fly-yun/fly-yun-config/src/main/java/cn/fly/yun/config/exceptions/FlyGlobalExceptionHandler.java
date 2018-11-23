package cn.fly.yun.config.exceptions;

import cn.fly.yun.config.exceptions.response.*;
import cn.fly.yun.config.utils.ThreadLocalUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
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
