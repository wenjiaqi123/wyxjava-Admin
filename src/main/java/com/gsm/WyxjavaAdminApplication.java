package com.gsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//包扫描，配置该注解，Dao层里可以不加注解
@MapperScan("com.gsm.dao")
//配置事务
@ImportResource("classpath:transaction.xml")
//扫描启动
@SpringBootApplication
public class WyxjavaAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyxjavaAdminApplication.class, args);
    }

}
