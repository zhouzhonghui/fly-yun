package cn.fly.yun.config.exceptions.response;


import cn.fly.yun.config.enums.ExceptionType;
import cn.fly.yun.config.exceptions.errors.MainError;
import cn.fly.yun.config.exceptions.errors.SubError;
import cn.fly.yun.config.exceptions.errors.SubErrorType;
import cn.fly.yun.config.exceptions.errors.SubErrors;

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
public class UncaughtExceptionResponse extends ErrorResponse {
    public UncaughtExceptionResponse() {
    }

    public UncaughtExceptionResponse(Locale locale, Throwable throwable) {
        MainError mainError = SubErrors.getMainError(SubErrorType.ISP_UNCAUGHT_EXCEPTION, locale);
        SubError subError = SubErrors.getSubError(ExceptionType.ISP.toString() +"uncaught_exception",
                SubErrorType.ISP_UNCAUGHT_EXCEPTION.value(),
                locale, throwable.toString());

        ArrayList<SubError> subErrors = new ArrayList<>();
        subErrors.add(subError);
        setMainError(mainError);
        setSubErrors(subErrors);
    }
}
