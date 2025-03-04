package com.atl23.jwtconvertor.service;


import com.atl23.jwtconvertor.dao.UserEntity;

import com.atl23.jwtconvertor.dto.UserRequest;

public interface UserService {

    void createUser(UserRequest request);

    UserEntity findByUsername(String username);

}
