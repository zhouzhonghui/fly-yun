package cn.fly.yun.config.exceptions.response;

import cn.fly.yun.config.exceptions.BusinessException;
import cn.fly.yun.config.exceptions.errors.MainError;
import cn.fly.yun.config.exceptions.errors.SubError;
import cn.fly.yun.config.exceptions.errors.SubErrorType;
import cn.fly.yun.config.exceptions.errors.SubErrors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Locale;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class BusinessErrorResponse extends ErrorResponse {
    public BusinessErrorResponse() {
    }

    public BusinessErrorResponse(Locale locale, Throwable throwable) {
        MainError mainError = SubErrors.getMainError(SubErrorType.ISP_BUSINESS_EXCEPTION, locale);

        BusinessException businessException = (BusinessException) throwable;
        SubError subError = SubErrors.getSubError(businessException.getCode(),
                businessException.getMessage(),
                locale, businessException.getValues());

        ArrayList<SubError> subErrors = new ArrayList<>();
        subErrors.add(subError);
        setMainError(mainError);
        setSubErrors(subErrors);
    }
}