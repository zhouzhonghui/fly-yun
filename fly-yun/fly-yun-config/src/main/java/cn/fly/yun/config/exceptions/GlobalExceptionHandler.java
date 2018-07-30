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
public class GlobalExceptionHandler {
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

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

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
        ErrorResponse errorResponse = new UncaughtExceptionResponse(getLocaleByThreadLocal(), e);
        return errorResponse;
    }

    /**
     * 请求参数异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleException(MethodArgumentNotValidException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        ErrorResponse errorResponse = new ConstraintViolationResponse(getLocaleByThreadLocal(), e);
        return errorResponse;
    }

    /**
     * 未登录
     *
     * @param e
     * @return
     */
    @ExceptionHandler(UnauthenticatedException.class)
    public ErrorResponse handleException(UnauthenticatedException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        ErrorResponse errorResponse = new AuthenticatedResponse(getLocaleByThreadLocal());
        return errorResponse;
    }

    /**
     * 没有权限
     *
     * @param e
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ErrorResponse handleException(UnauthorizedException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        ErrorResponse errorResponse = new AuthorizedResponse(getLocaleByThreadLocal(), e.getMessage());
        return errorResponse;
    }

    /**
     * 自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ErrorResponse handleException(BusinessException e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        ErrorResponse errorResponse = new BusinessErrorResponse(getLocaleByThreadLocal(), e);
        return errorResponse;
    }

    /**
     * oauth2验证
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Oauth2Exception.class)
    public ErrorResponse handleException(Oauth2Exception e) {
        logger.error("==============================ExceptionMapperSupport============================", e);
        ErrorResponse errorResponse = new Oauth2ErrorResponse(getLocaleByThreadLocal(), e);
        return errorResponse;
    }
}
