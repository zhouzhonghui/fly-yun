package cn.fly.yun.base;

import java.beans.Transient;
import java.io.Serializable;

public class BaseDomain implements Serializable {
    private static final long serialVersionUID = 5701716904246058908L;

    /**
     * 访问服务
     */
    private String serviceName;
    /**
     * 交易对应中文名称
     */
    private String transName;
    /**
     * 国际化
     */
    private String requestLocale;
    /**
     * 版本号
     */
    private String version;

    @Transient
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Transient
    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }

    @Transient
    public String getRequestLocale() {
        return requestLocale;
    }

    public void setRequestLocale(String requestLocale) {
        this.requestLocale = requestLocale;
    }

    @Transient
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
