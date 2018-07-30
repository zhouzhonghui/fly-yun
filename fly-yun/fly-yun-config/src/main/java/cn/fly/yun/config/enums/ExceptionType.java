package cn.fly.yun.config.enums;

public enum ExceptionType {

    /**
     * Internet Service Provider
     * 服务端错误
     */
    ISP("isp."),
    /**
     * (Independent Software Vendors)
     * 客户端错误
     */
    ISV("isv.") ;

    private String code;

    ExceptionType(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
