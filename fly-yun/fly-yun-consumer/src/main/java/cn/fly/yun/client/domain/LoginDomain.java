package cn.fly.yun.client.domain;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class LoginDomain implements Serializable {
    private static final long serialVersionUID = -8404469203514377792L;
    @NotEmpty
    private String loginName ;
    @NotEmpty
    private String passwd ;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "LoginDomain{" +
                "loginName='" + loginName + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
