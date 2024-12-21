package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.SignupDto;
import com.dev.gorideapp.dto.UserDto;

public interface AuthService {
    void login(String email, String password);
    UserDto signup(SignupDto signupDto);
}
