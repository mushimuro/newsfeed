package com.sparta.newsfeedapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication
@EnableJpaAuditing
@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // Spring Security 인증 기능 제외
public class NewsfeedAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsfeedAppApplication.class, args);
    }

}