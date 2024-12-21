package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.SignupDto;
import com.dev.gorideapp.dto.UserDto;
import com.dev.gorideapp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
