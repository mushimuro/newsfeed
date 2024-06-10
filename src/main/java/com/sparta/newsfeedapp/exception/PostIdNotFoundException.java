package com.sparta.newsfeedapp.exception;

public class PostIdNotFoundException extends NullPointerException{
    public PostIdNotFoundException() {
        super("PostId를 찾을 수 없습니다.");
    }
}
