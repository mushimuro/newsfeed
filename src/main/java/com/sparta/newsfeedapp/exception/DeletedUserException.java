package com.sparta.newsfeedapp.exception;

public class DeletedUserException extends IllegalArgumentException{
    public DeletedUserException() {
        super("비밀번호가 일치하지 않습니다.");
    }
}
