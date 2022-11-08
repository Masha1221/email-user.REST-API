package com.example.user.services;


import com.example.user.DTOs.UserDTO;
import org.springframework.stereotype.Component;

@Component
public interface UsersService {

    UserDTO registerUser(UserDTO userDTO);

    void deleteUserById(Integer id);
}
