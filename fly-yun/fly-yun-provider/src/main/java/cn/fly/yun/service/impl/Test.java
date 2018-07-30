package cn.fly.yun.service.impl;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        System.out.println((int) (Math.random()*100+1));

        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));
    }
}
