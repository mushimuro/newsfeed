package com.sparta.newsfeedapp.controller;

import com.sparta.newsfeedapp.Service.UserService;
import com.sparta.newsfeedapp.dto.AuthRequestDto;
import com.sparta.newsfeedapp.dto.AuthResponseDto;
import com.sparta.newsfeedapp.entity.User;
import com.sparta.newsfeedapp.jwt.JwtUtil;
import com.sparta.newsfeedapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class userController {

    private final UserRepository userRepository;
    private final UserService userService;
    private final JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@RequestBody AuthRequestDto authRequestDto){
        try{
            User user = userService.login(authRequestDto.getUserId(), authRequestDto.getPassword());
            String userId = user.getUserId();
            String token = jwtUtil.createToken(userId);

            AuthResponseDto authResponseDto = new AuthResponseDto("로그인 성공", token);
            return new ResponseEntity<>(authResponseDto, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(new AuthResponseDto("유효하지 않은 사용자 ID 또는 비밀번호", null), HttpStatus.UNAUTHORIZED);
        }
    }
}
