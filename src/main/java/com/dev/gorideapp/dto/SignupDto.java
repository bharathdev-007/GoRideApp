package com.dev.gorideapp.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class SignupDto {

    private String username;
    private String email;
    private String password;

}
