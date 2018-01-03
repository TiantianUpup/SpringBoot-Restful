package com.cqupt.restful;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动引导类
 * @SpringBootApplication开启了spring组件扫描和spring boot的自动配置功能
 * @SpringBootApplication将三个注解组合在一起了
 * 1）@ComponentScan
 * 2）@EnableAutoConfiguration开启自动配置
 * 3）@Configuration 在该类中写基于java的配置
 * */
@SpringBootApplication
// mapper 接口类扫描包配置
//@MapperScan("classpath:mapper/*.xml")
public class RestfuldemoApplication {

	public static void main(String[] args) {
		//启动应用程序
		//启动嵌入式的tomcat，并初始化spring环境和spring组件
		SpringApplication.run(RestfuldemoApplication.class, args);
	}
}
