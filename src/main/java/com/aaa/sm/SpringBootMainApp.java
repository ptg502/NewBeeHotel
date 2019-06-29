package com.aaa.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * className:SpringBootMainApp
 * discriptoin:
 * author:zz
 * createTime:2018-11-09 14:01
 */
//@EnableTransactionManagement //开启注解式事务
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.aaa.sm.dao")
public class SpringBootMainApp {

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApp.class);
    }
}
