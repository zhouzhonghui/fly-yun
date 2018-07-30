/**
 *
 * 日    期：12-2-11
 */
package cn.fly.yun.config.exceptions.errors;

import java.util.List;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public interface MainError {

    int getCode();

    String getMessage();

    String getSolution();

    List<SubError> getSubErrors();

    MainError addSubError(SubError subError);

}

