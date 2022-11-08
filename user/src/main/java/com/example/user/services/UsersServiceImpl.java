package com.example.user.services;

import com.example.user.DTOs.UserDTO;
import com.example.user.entities.UserEntity;
import com.example.user.exceptions.ApiRequestException;
import com.example.user.repositories.UsersRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        UserEntity existingUser = usersRepository.findById(userDTO.getId()).orElse(null);
        if (userEntity == null) {
            throw new ApiRequestException("Department with this ID is not exist.");
        }
        userEntity.se(departmentEntity);
        employeesRepository.save(employeeEntity);
        return employeeDTO;
    }


    @Override
    public void deleteUserById(Integer id) {

    }
}
