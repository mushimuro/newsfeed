package com.sparta.newsfeedapp.filter;

import com.sparta.newsfeedapp.jwt.JwtUtil;
import com.sparta.newsfeedapp.repository.UserRepository;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;

@Slf4j(topic = "AuthFilter")
@Component
@Order(2)
public class AuthFilter implements Filter {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public AuthFilter(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String url = httpServletRequest.getRequestURI();

        if ( StringUtils.hasText(url) && (url.startsWith("/api/users")) ) {
            System.out.println("인증처리 안하는 url" + url);
            // 인증 필요없이 요청 진행
            chain.doFilter(request, response); // 다음 Filter 로 이동
        }
    }

}
