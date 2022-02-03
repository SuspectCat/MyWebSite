package com.service;

import com.commons.ResponseResult;

import java.io.IOException;

public interface UserService {
    ResponseResult userLogin(String username, String password) throws IOException;
}
