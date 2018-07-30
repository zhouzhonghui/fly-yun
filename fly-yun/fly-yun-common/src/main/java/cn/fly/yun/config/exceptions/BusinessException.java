package cn.fly.yun.config.exceptions;

public class BusinessException extends BaseCheckedException {

    private static final long serialVersionUID = 2842982651275587898L;

    /**
     * Constructors
     *
     * @param code 错误代码
     */
    public BusinessException(String message, String code) {
        super(message, null, code, null);
    }

    /**
     * Constructors
     *
     * @param code 错误代码
     */
    public BusinessException(String code) {
        super(code, null, code, null);
    }

    /**
     * Constructors
     *
     * @param cause 异常接口
     * @param code  错误代码
     */
    public BusinessException(Throwable cause, String code) {
        super(code, cause, code, null);
    }

    /**
     * Constructors
     *
     * @param code   错误代码
     * @param values 一组异常信息待定参数
     */
    public BusinessException(String code, Object... values) {
        super(code, null, code, values);
    }

    /**
     * Constructors
     *
     * @param cause  异常接口
     * @param code   错误代码
     * @param values 一组异常信息待定参数
     */
    public BusinessException(Throwable cause, String code, Object... values) {
        super(code, null, code, values);
    }
}