package com.dev.gorideapp.services.impl;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.SignupDto;
import com.dev.gorideapp.dto.UserDto;
import com.dev.gorideapp.entities.User;
import com.dev.gorideapp.entities.enums.Role;
import com.dev.gorideapp.exceptions.RuntimeConflictException;
import com.dev.gorideapp.repositories.UserRepository;
import com.dev.gorideapp.services.AuthService;
import com.dev.gorideapp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private  final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRole(Set.of(Role.RIDER));
        User savedUser = userRepository.save(mappedUser);

//        create user related entities
        riderService.createNewRider(savedUser);
//        TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
