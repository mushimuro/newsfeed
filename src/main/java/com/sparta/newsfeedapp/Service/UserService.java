package com.sparta.newsfeedapp.Service;

import com.sparta.newsfeedapp.entity.User;
import com.sparta.newsfeedapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User login(String userId, String password){
        User user = userRepository.findByUserId(userId).orElseThrow(IllegalArgumentException::new);
        if(user == null || !user.getPassword().equals(password)){
            throw new IllegalArgumentException("사용자 ID 또는 비밀번호가 잘못되었습니다.");
        }
        return user;
    }


}
