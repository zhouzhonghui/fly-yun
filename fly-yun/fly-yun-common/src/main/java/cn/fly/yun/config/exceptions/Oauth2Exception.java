package cn.fly.yun.config.exceptions;

public class Oauth2Exception extends BaseException {
    private static final long serialVersionUID = -8214305547137318045L;

    /**
     * Constructors
     *
     * @param code 错误代码
     */
    public Oauth2Exception(String message, String code) {
        super(message, null, code, null);
    }

    /**
     * Constructors
     *
     * @param code 错误代码
     */
    public Oauth2Exception(String code) {
        super(code, null, code, null);
    }

    /**
     * Constructors
     *
     * @param cause 异常接口
     * @param code  错误代码
     */
    public Oauth2Exception(Throwable cause, String code) {
        super(code, cause, code, null);
    }

    /**
     * Constructors
     *
     * @param code   错误代码
     * @param values 一组异常信息待定参数
     */
    public Oauth2Exception(String code, Object... values) {
        super(code, null, code, values);
    }

    /**
     * Constructors
     *
     * @param cause  异常接口
     * @param code   错误代码
     * @param values 一组异常信息待定参数
     */
    public Oauth2Exception(Throwable cause, String code, Object... values) {
        super(code, null, code, values);
    }
}
