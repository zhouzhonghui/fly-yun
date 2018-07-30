package cn.fly.yun.base;


public class BaseRes extends BaseReq {
    private static final long serialVersionUID = 6676429461073761401L;

    protected int code = 1;

    protected String message = "success!";

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
}
