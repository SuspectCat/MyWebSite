package com.service.impl;

import com.commons.ResponseResult;
import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public ResponseResult userLogin(String username, String password) {
        User userByUsername = userMapper.findUserByUsername(username);

        if (null != userByUsername)
            if (DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)).equalsIgnoreCase(userByUsername.getPassword()))
                return ResponseResult.OKData(userByUsername);
            else
                return ResponseResult.error("登陆失败， 密码错误");

            return ResponseResult.error("登陆失败用户名错误");
    }
}
