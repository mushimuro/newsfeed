package com.sparta.newsfeedapp.exception;

public class UserMismatchException extends IllegalArgumentException{
    public UserMismatchException() {
        super("본인이 작성한 글만 수정가능합니다.");
    }
}
