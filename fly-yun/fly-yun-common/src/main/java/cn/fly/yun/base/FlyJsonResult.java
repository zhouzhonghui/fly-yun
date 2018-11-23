package cn.fly.yun.base;

import java.io.Serializable;

public class FlyJsonResult<T> implements Serializable {
    private static final long serialVersionUID = -1896378314922924761L;
    //更改返回成功的code值
    protected int code = 0;
    protected String message = "success";
    //1.0.3版本增加需要的request_id
    protected String request_id;

    protected T result;

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

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FlyJsonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", request_id='" + request_id + '\'' +
                ", result=" + result +
                '}';
    }
}
