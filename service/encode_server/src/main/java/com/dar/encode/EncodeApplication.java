package com.dar.encode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :wx
 * @description :
 * @create :2022-01-28 15:01:00
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dar"})
public class EncodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EncodeApplication.class,args);
    }

}
