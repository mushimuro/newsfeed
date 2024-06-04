package com.sparta.newsfeedapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name= "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String password;
    private String username;
    private String email;
    private String selfIntroduce;
    private String refreshToken;
    private LocalDateTime statusEditAt;
    private LocalDateTime createdAt;
    private LocalDateTime editedAt;
}
