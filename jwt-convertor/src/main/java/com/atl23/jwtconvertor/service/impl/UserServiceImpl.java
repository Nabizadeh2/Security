package com.atl23.jwtconvertor.service.impl;

import com.atl23.jwtconvertor.dao.UserEntity;
import com.atl23.jwtconvertor.dao.UserRepository;
import com.atl23.jwtconvertor.dto.UserRequest;
import com.atl23.jwtconvertor.exception.UserNotFoundException;
import com.atl23.jwtconvertor.service.UserService;
import com.atl23.jwtconvertor.util.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final BCryptPasswordEncoder encoder;
    private final UserRepository userRepository;


    @Override
    public void createUser(UserRequest request) {
        UserEntity userEntity = UserEntity
                .builder()
                .name(request.getName())
                .surname(request.getSurname())
                .username(request.getUsername())
                .password(encoder.encode(request.getPassword()))
                .age(request.getAge())
                .userRole(UserRole.USER)
                .build();
        userRepository.save(userEntity);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UserNotFoundException("user not found with username + " + username));
    }

}
