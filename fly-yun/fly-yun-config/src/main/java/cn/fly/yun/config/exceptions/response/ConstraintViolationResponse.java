package cn.fly.yun.config.exceptions.response;

import cn.fly.yun.config.exceptions.errors.MainError;
import cn.fly.yun.config.exceptions.errors.SubError;
import cn.fly.yun.config.exceptions.errors.SubErrorType;
import cn.fly.yun.config.exceptions.errors.SubErrors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 请求参数校验
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class ConstraintViolationResponse extends ErrorResponse {
    public ConstraintViolationResponse() {
    }

    public ConstraintViolationResponse(Locale locale, Throwable throwable) {
        MainError mainError = SubErrors.getMainError(SubErrorType.ISV_BEAN_VALIDATOR, locale);
        ArrayList<SubError> subErrors = new ArrayList<>();

        List<ObjectError> list= ((MethodArgumentNotValidException) throwable).getBindingResult().getAllErrors();

        for(ObjectError objectError:list){
            SubError subError = SubErrors.getSubError(objectError.getDefaultMessage(),
                    objectError.getDefaultMessage(),
                    locale);
            subErrors.add(subError);
        }

        setMainError(mainError);
        setSubErrors(subErrors);
    }
}
