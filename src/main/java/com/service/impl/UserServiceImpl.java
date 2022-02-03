package com.service.impl;

import com.commons.ResponseResult;
import com.mapper.UserMapper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public ResponseResult userLogin(String username, String password) throws IOException {
        User userByUsername = userMapper.findUserByUsername(username);
//        HttpServletResponse response = null;
//
//        final int width = 180;
//        final int height = 40;
//        final String imgType = "jpeg";
//        final OutputStream output = response.getOutputStream();
//
//
//        String code = VerificationCode.create(width, height, imgType, output);
//        System.out.println("验证码内容：" + code);

        if (null != userByUsername)
            if (DigestUtils.md5DigestAsHex(password.getBytes()).equalsIgnoreCase(userByUsername.getPassword()))
                return ResponseResult.OKData(userByUsername);
            else
                return ResponseResult.error("登陆失败， 密码错误");

            return ResponseResult.error("登陆失败, 用户名错误");
    }

    public static void main(String[] args) {
        String str = "1";

        System.out.println(DigestUtils.md5DigestAsHex(str.getBytes()));
    }
}
