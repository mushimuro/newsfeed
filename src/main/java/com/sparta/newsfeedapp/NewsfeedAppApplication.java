package com.sparta.newsfeedapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class NewsfeedAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsfeedAppApplication.class, args);
    }

}
