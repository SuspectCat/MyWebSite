package com.service;

import com.commons.ResponseResult;

public interface UserService {
    ResponseResult userLogin(String username, String password);
}
