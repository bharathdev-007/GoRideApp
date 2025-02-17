package com.dev.gorideapp.contollers;

import com.dev.gorideapp.dto.DriverDto;
import com.dev.gorideapp.dto.OnboardDriverDto;
import com.dev.gorideapp.dto.SignupDto;
import com.dev.gorideapp.dto.UserDto;
import com.dev.gorideapp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    UserDto signUp(@RequestBody SignupDto signupDto) {

        return authService.signup(signupDto);
    }

    @PostMapping("/onBoardNewDriver/{userId}")
    ResponseEntity<DriverDto> onBoardNewDriver(@PathVariable Long userId, @RequestBody OnboardDriverDto onboardDriverDto) {
        return new ResponseEntity<>(authService.onBoardNewDriver(userId,
                onboardDriverDto.getVehicleId()), HttpStatus.CREATED);
    }

}
