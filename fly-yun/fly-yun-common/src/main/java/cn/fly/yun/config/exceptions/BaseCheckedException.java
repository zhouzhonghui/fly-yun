package cn.fly.yun.config.exceptions;

public class BaseCheckedException extends Exception {
    private static final long serialVersionUID = -944619477084676454L;
    /**
     * message key
     */
    private String code;

    /**
     * message params
     */
    private Object[] values;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the values
     */
    public Object[] getValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues(Object... values) {
        this.values = values;
    }

    public BaseCheckedException(String message, Throwable cause, String code, Object... values) {
        super(message, cause);
        this.code = code;
        this.values = values;
    }
}
