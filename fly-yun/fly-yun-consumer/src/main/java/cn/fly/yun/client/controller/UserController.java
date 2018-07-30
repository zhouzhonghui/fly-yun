package cn.fly.yun.client.controller;

import cn.fly.yun.client.domain.User;
import cn.fly.yun.client.refence.HelloServiceRefence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/test")
public class UserController {
    @Autowired
    private HelloServiceRefence helloServiceRefence;


    @RequestMapping(value = "/saveUser",method = RequestMethod.POST,consumes="application/json",produces = "application/json")
    public User saveUser(@RequestBody @Valid User user){
//        template.opsForValue().set(user.getId(),user,100000, TimeUnit.SECONDS);
        if(true) {
            throw new RuntimeException();
        }
        return user;
    }

    @RequestMapping(value = "/getUser/{name}",method = RequestMethod.GET,consumes="application/json",produces = "application/json")
    public User getUser(@PathVariable String name){
        User user = new User();
        user.setName(name) ;
        return user ;

    }
}
