package com.huas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration

//  @EnableZuulProxy 包含了@EnableZuulServer , 设置该类是网关的启动类
//  @EnableAutoConfiguration ： 帮助springboot 应用将所有符合条件的@Configuration 配置加载到当前
//  Spring boot 创建并使用的Ioc 容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
