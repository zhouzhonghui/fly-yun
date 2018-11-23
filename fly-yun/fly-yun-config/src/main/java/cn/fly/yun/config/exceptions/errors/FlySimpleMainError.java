package cn.fly.yun.config.exceptions.errors;

public class FlySimpleMainError implements FlyMainError {

    private int code;

    private String message;

    public FlySimpleMainError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

