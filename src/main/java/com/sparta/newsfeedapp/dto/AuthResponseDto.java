package com.sparta.newsfeedapp.dto;

import lombok.Getter;

@Getter
public class AuthResponseDto {
    private String message;
    private String token;

    public AuthResponseDto(String message, String token) {
        this.message = message;
        this.token = token;
    }
}
