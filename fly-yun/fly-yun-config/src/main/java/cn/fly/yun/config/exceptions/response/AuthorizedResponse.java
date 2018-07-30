package cn.fly.yun.config.exceptions.response;

import cn.fly.yun.config.exceptions.errors.MainError;
import cn.fly.yun.config.exceptions.errors.SubError;
import cn.fly.yun.config.exceptions.errors.SubErrorType;
import cn.fly.yun.config.exceptions.errors.SubErrors;
import cn.fly.yun.config.enums.ExceptionType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Locale;

/**
 * 未授权
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class AuthorizedResponse extends ErrorResponse {

    public AuthorizedResponse() {
    }

    public AuthorizedResponse(Locale locale, String message) {
        MainError mainError = SubErrors.getMainError(SubErrorType.ISV_NOT_AUTHORIZED, locale);
        SubError subError = SubErrors.getSubError(ExceptionType.ISV.toString() + message,
                SubErrorType.ISV_NOT_AUTHORIZED.value(),
                locale, "NONE");

        ArrayList<SubError> subErrors = new ArrayList<>();
        subErrors.add(subError);
        setMainError(mainError);
        setSubErrors(subErrors);
    }
}
