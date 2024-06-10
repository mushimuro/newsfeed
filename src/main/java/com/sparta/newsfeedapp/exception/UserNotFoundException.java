package com.sparta.newsfeedapp.exception;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserNotFoundException extends UsernameNotFoundException {
    public UserNotFoundException() {
        super("해당 User를 찾을 수 없습니다.");
    }
}
