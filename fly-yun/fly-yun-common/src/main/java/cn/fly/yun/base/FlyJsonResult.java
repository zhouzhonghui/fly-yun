package cn.fly.yun.base;

public class FlyJsonResult extends BaseReq {
    private static final long serialVersionUID = -1896378314922924761L;

    protected int code = 1;
    protected String message = "success!";
    //1.0.3版本增加需要的request_id
    protected String request_id;

    protected Object result;

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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
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