package com.school.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("com.school.book.mapper")
public class App 
{
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
