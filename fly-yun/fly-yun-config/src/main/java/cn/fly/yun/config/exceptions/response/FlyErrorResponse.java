/**
 *
 * 日    期：12-2-10
 */
package cn.fly.yun.config.exceptions.response;


import cn.fly.yun.config.exceptions.errors.FlyMainError;
import cn.fly.yun.config.exceptions.errors.MainError;
import cn.fly.yun.config.exceptions.errors.MainErrorType;
import cn.fly.yun.config.exceptions.errors.MainErrors;

import javax.xml.bind.annotation.*;
import java.util.Locale;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "error")
public class FlyErrorResponse {

    @XmlAttribute
    protected int code;

    @XmlElement
    protected String message;

    public FlyErrorResponse() {

    }

    public FlyErrorResponse(MainError mainError) {
        this.code = mainError.getCode();
        this.message = mainError.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    protected MainError getInvalidArgumentsError(Locale locale) {
        return MainErrors.getError(MainErrorType.INVALID_ARGUMENTS, locale);
    }

    protected void setMainError(FlyMainError mainError) {
        setCode(mainError.getCode());
        setMessage(mainError.getMessage());
    }


    /**
     * 对服务名进行标准化处理：如book.upload转换为book-upload，
     *
     * @param method
     * @return
     */
    protected String transform(String method) {
        if(method != null){
            method = method.replace(".", "-");
            return method;
        }else{
            return "LACK_METHOD";
        }
    }

}

