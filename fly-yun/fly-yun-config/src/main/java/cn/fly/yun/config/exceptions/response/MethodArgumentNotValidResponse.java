package cn.fly.yun.config.exceptions.response;

import cn.fly.yun.config.exceptions.errors.FlyJsonMainErrors;
import cn.fly.yun.config.exceptions.errors.FlyMainError;

import java.util.Locale;

public class MethodArgumentNotValidResponse extends FlyErrorResponse {
    public MethodArgumentNotValidResponse() {
    }

    public MethodArgumentNotValidResponse(int errorCode, Locale locale, Throwable throwable) {
        FlyMainError flyMainError= FlyJsonMainErrors.getError(errorCode,locale);
        setMainError(flyMainError);
    }
}
