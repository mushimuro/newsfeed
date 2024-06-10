package com.sparta.newsfeedapp.exception;

public class PasswordMistmatchException extends IllegalArgumentException {
    public PasswordMistmatchException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}
