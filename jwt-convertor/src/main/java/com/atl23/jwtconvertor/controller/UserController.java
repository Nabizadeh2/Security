package com.atl23.jwtconvertor.controller;


import com.atl23.jwtconvertor.dto.UserRequest;
import com.atl23.jwtconvertor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
        return ResponseEntity.ok().build();
    }

}
