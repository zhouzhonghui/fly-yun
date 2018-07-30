/**
 * 日    期：12-2-23
 */
package cn.fly.yun.config.exceptions.errors;

import java.util.EnumMap;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public enum SubErrorType {
    ISP_SERVICE_UNAVAILABLE,
    ISP_SERVICE_TIMEOUT,
    ISV_NOT_EXIST,
    ISV_INVALID_PERMISSION,
    ISV_MISSING_PARAMETER,
    ISV_INVALID_PARAMETE,


    /**
     * 客户尚未认证
     */
    ISV_NOT_AUTHENTICATED,
    /**
     * 客户无此权限
     */
    ISV_NOT_AUTHORIZED,
    /**
     * 服务端未捕获异常
     */
    ISP_UNCAUGHT_EXCEPTION,
    /**
     * 客户端请求数据校验非法
     */
    ISV_BEAN_VALIDATOR,
    /**
     * oauth2校验
     */
    ISV_OAUTH2_INVALID,

    /**
     * 业务异常
     */
    ISP_BUSINESS_EXCEPTION;

    private static EnumMap<SubErrorType, String> errorKeyMap = new EnumMap(SubErrorType.class);

    static {
        errorKeyMap.put(SubErrorType.ISP_SERVICE_UNAVAILABLE, "isp.xxx-service-unavailable");
        errorKeyMap.put(SubErrorType.ISP_SERVICE_TIMEOUT, "isp.xxx-service-timeout");

        errorKeyMap.put(SubErrorType.ISV_NOT_EXIST, "isv.xxx-not-exist:invalid-yyy");
        errorKeyMap.put(SubErrorType.ISV_MISSING_PARAMETER, "isv.missing-parameter:xxx");
        errorKeyMap.put(SubErrorType.ISV_INVALID_PARAMETE, "isv.invalid-paramete:xxx");
        errorKeyMap.put(SubErrorType.ISV_INVALID_PERMISSION, "isv.invalid-permission");

        /**
         * 客户尚未认证
         */
        errorKeyMap.put(SubErrorType.ISV_NOT_AUTHENTICATED, "isv.user_not_authenticated");
        /**
         * 客户无此权限
         */
        errorKeyMap.put(SubErrorType.ISV_NOT_AUTHORIZED, "isv.user_not_authorized");
        /**
         * 服务端未捕获异常
         */
        errorKeyMap.put(SubErrorType.ISP_UNCAUGHT_EXCEPTION, "isp.uncaught_exception");
        /**
         * 客户端请求数据校验非法
         */
        errorKeyMap.put(SubErrorType.ISV_BEAN_VALIDATOR, "isv.bean_validator");
    }

    public String value() {
        return errorKeyMap.get(this);
    }
}

