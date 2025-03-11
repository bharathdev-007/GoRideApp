package com.dev.gorideapp.dto;


import lombok.Data;

@Data
public class LoginRequestDto {
    private String email;
    private String password;
}