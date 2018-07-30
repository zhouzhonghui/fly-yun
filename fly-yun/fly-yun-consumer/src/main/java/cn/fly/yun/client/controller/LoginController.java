package cn.fly.yun.client.controller;


import cn.fly.yun.client.domain.LoginDomain;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping(value = "/api",consumes="application/json",produces = "application/json")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public LoginDomain login(@RequestBody @Valid LoginDomain loginDomain, @RequestHeader("Accept") String accept){
        String username = loginDomain.getLoginName() ;
        String password = loginDomain.getPasswd() ;

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String sessionId = session.getId().toString();

        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);

        subject.login(usernamePasswordToken);

        return loginDomain;
    }
    @RequiresPermissions("xxxX")
    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public LoginDomain test(@RequestBody @Valid LoginDomain loginDomain){

        return loginDomain;
    }
}
