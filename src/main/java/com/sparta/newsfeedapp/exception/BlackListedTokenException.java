package com.sparta.newsfeedapp.exception;

import jakarta.servlet.ServletException;

public class BlackListedTokenException extends ServletException {
    public BlackListedTokenException() {
        super("black list된 토큰입니다.");
    }
}
