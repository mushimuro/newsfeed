package com.sparta.newsfeedapp.exception;

public class CommentIdNotFoundException extends NullPointerException{
    public CommentIdNotFoundException() {
        super("Comment Id를 찾을 수 없습니다.");
    }
}
