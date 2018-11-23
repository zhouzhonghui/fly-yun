package cn.fly.yun.config.exceptions.response;

import cn.fly.yun.config.exceptions.BusinessException;
import cn.fly.yun.config.exceptions.errors.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Locale;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class FlyBusinessErrorResponse extends FlyErrorResponse {
    public FlyBusinessErrorResponse() {
    }

    public FlyBusinessErrorResponse(int errorCode,Locale locale, Throwable throwable) {
        FlyMainError flyMainError=FlyJsonMainErrors.getError(errorCode,locale);
        setMainError(flyMainError);
    }
}