package cn.fly.yun.client.refence;

import cn.fly.yun.domain.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceRefence {
    @Reference(version = "1.0.0")
    public HelloService helloService;
}
