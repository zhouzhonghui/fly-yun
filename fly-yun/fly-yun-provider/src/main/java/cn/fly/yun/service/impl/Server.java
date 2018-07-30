package cn.fly.yun.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.fly.yun.mapper")
@EnableTransactionManagement
@EnableScheduling
@ComponentScan(basePackages={"cn.fly.yun"})
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class,args);
    }
}
