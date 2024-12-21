package com.dev.gorideapp.services;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.SignupDto;
import com.dev.gorideapp.dto.UserDto;

public interface AuthService {
    String login(String email, String password);
    UserDto signup(SignupDto signupDto);

    DriverDto onBoardNewDriver(Long userId);
}
