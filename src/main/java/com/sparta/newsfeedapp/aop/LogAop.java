package com.sparta.newsfeedapp.aop;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.HttpMethod;
import org.springframework.security.web.session.RequestedUrlRedirectInvalidSessionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Slf4j(topic = "LogAop")
@Aspect
@Component
public class LogAop {

    @Pointcut("execution(* com.sparta.newsfeedapp.controller.AuthController.*(..))")
    private void auth(){}
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.CommentController.*(..))")
    private void comment(){}
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.MailController.*(..))")
    private void mail(){}
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.PostController.*(..))")
    private void post(){}
    @Pointcut("execution(* com.sparta.newsfeedapp.controller.UserController.*(..))")
    private void user(){}

    @Before("auth() || comment() || mail() || post() || user()")
    public void log(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(attributes != null){
            HttpServletRequest request = attributes.getRequest();
            log.info("Request URL: {}, HTTP Method: {}", request.getRequestURL(), request.getMethod());
        }
    }
}
