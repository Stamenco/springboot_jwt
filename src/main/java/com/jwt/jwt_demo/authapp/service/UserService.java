package com.jwt.jwt_demo.authapp.service;

import org.springframework.stereotype.Service;
import com.jwt.jwt_demo.authapp.dto.UserSummary;
import com.jwt.jwt_demo.authapp.security.UserPrincipal;

@Service
public class UserService {

    public UserSummary getCurrentUser(UserPrincipal userPrincipal) {
        return UserSummary.builder()
                .id(userPrincipal.getId())
                .email(userPrincipal.getEmail())
                .name(userPrincipal.getName())
                .build();
    }
}
