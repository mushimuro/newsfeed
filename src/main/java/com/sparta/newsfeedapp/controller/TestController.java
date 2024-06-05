package com.sparta.newsfeedapp.controller;

import com.sparta.newsfeedapp.entity.User;
import com.sparta.newsfeedapp.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String getTestData(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        User user = userDetails.getUser();
        System.out.println("user.getUserId() = " + user.getUserId());
        System.out.println("user.getEmail() = " + user.getEmail());

        return "redirect:/";
    }
}
