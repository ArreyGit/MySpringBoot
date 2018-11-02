package com.arrey.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication
 *  等价于@Configuration、@EnableAutoConfiguration、@ComponentScan,
 *  查看SpringBootApplication注解可以发现@ComponentScan并没有添加任何的参数，
 *  它会自动扫描工程里所有的@Component, @Service, @Repository, @Controller并把它们注册为Spring Beans。
 *
 *  PS:需要添加ComponentScan自动扫描注解，否则不会扫描其他包下的类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.arrey"})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
