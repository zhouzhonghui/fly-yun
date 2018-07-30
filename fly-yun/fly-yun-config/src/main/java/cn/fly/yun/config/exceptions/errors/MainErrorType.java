/**
 *
 * 日    期：12-2-23
 */
package cn.fly.yun.config.exceptions.errors;

import javax.ws.rs.core.Response;
import java.util.EnumMap;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public enum MainErrorType {

    /**
     * 客户未授权
     */
    ISV_NOT_AUTHENTICATED,
    /**
     * 服务器异常
     */
    ISP_EXCEPTION,
    /**
     * 错误的请求
     */
    ISV_BAD_REQUEST,
    /**
     * 禁止访问
     */
    ISV_FORBIDDEN,
    /**
     * 自定义业务类异常
     */
    SERVICE_UNAVAILABLE,

    SERVICE_CURRENTLY_UNAVAILABLE,
    INSUFFICIENT_ISV_PERMISSIONS,
    MISSING_REQUIRED_ARGUMENTS,
    INVALID_ARGUMENTS;



    private static EnumMap<MainErrorType, Integer> errorCodeMap = new EnumMap(MainErrorType.class);

    static {
        errorCodeMap.put(MainErrorType.SERVICE_CURRENTLY_UNAVAILABLE, Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());

        /**
         * 客户尚未认证
         */
        errorCodeMap.put(MainErrorType.ISV_NOT_AUTHENTICATED, Response.Status.UNAUTHORIZED.getStatusCode());

        /**
         * 服务器异常
         */
        errorCodeMap.put(MainErrorType.ISP_EXCEPTION, Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());

        /**
         * 错误的请求
         */
        errorCodeMap.put(MainErrorType.ISV_BAD_REQUEST, Response.Status.BAD_REQUEST.getStatusCode());

        /**
         * 禁止访问
         */
        errorCodeMap.put(MainErrorType.ISV_FORBIDDEN, Response.Status.FORBIDDEN.getStatusCode());

        /**
         * 自定义业务类异常
         */
        errorCodeMap.put(MainErrorType.SERVICE_UNAVAILABLE, Response.Status.SERVICE_UNAVAILABLE.getStatusCode());
    }

    public int value() {
        return errorCodeMap.get(this);
    }
}

