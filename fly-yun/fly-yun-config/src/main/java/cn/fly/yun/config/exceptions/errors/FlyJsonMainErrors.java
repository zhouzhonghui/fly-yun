/**
 *
 * 日    期：12-2-11
 */
package cn.fly.yun.config.exceptions.errors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.util.Assert;

import java.util.Locale;


public class FlyJsonMainErrors {

    protected static Logger logger = LoggerFactory.getLogger(FlyJsonMainErrors.class);

    private static final String ERROR_CODE_PREFIX = "ERROR_";
    // 错误信息的国际化信息
    private static MessageSourceAccessor errorMessageSourceAccessor;


    public static FlyMainError getError(int mainErrorValue,Locale locale,Object... params) {
        String errorMessage = getErrorMessage(ERROR_CODE_PREFIX + mainErrorValue,locale,params);
        return new FlySimpleMainError(mainErrorValue, errorMessage);
    }

    public static void setErrorMessageSourceAccessor(MessageSourceAccessor errorMessageSourceAccessor) {
        FlyJsonMainErrors.errorMessageSourceAccessor = errorMessageSourceAccessor;
    }

    private static String getErrorMessage(String code, Locale locale,Object... params) {
        try {
            Assert.notNull(errorMessageSourceAccessor, "请先设置错误消息的国际化资源");
            return errorMessageSourceAccessor.getMessage(code, params, locale);
        } catch (NoSuchMessageException e) {
            logger.error("不存在对应的错误键：{}，请检查是否在i18n/rop/error的错误资源", code);
            throw e;
        }
    }



}

