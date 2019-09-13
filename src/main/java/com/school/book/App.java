package com.school.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@Configuration
public class App 
{
	public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
