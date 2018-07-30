package cn.fly.yun.client.refence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages={"cn.fly.yun"})
@ImportResource(locations={"classpath*:application-.xml"})
public class Client {
   static Logger logger= LoggerFactory.getLogger(Client.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
        HelloServiceRefence bean = run.getBean(HelloServiceRefence.class);
        System.out.println(bean.helloService.sayHello("tranDate"));
    }
}
