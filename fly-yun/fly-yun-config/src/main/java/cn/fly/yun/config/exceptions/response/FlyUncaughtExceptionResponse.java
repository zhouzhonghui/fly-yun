package cn.fly.yun.config.exceptions.response;


import cn.fly.yun.config.enums.ExceptionType;
import cn.fly.yun.config.exceptions.errors.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Locale;

/**
 * 未捕获
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class FlyUncaughtExceptionResponse extends FlyErrorResponse {
    public FlyUncaughtExceptionResponse() {
    }

    public FlyUncaughtExceptionResponse(int errorCode,Locale locale, Throwable throwable) {
        FlyMainError flyMainError=FlyJsonMainErrors.getError(errorCode,locale);
        setMainError(flyMainError);
    }
}
