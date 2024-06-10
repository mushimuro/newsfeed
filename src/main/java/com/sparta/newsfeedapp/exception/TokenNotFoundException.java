package com.sparta.newsfeedapp.exception;

import java.io.IOException;

public class TokenNotFoundException extends IOException {
    public TokenNotFoundException() {
        super("Token을 찾을 수 없습니다.");
    }
}
