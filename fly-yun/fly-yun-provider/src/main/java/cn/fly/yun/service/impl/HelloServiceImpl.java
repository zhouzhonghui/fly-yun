package cn.fly.yun.service.impl;


import cn.fly.yun.domain.HelloService;
import cn.fly.yun.mapper.NewsInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    NewsInfoMapper newsInfoMapper;

    @Override
    public String sayHello(String name) {
        System.out.println(redisTemplate.opsForHash().increment("tranDate", "20180411", 1));
        return "hello:" + redisTemplate.opsForHash().keys(name);
    }
}
