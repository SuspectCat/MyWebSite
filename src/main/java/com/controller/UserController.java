package com.controller;

import com.commons.ResponseResult;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${default.password}")
    private String defaultPassword;
    @Value("${default.head}")
    private String defaultHead;

    @PostMapping("login")
    public ResponseResult login(String username, String password, HttpSession session) {
        ResponseResult responseResult = userService.userLogin(username, password);

        if (200 == responseResult.getCode())
            session.setAttribute("user", responseResult.getData());

        return responseResult;
    }
}
