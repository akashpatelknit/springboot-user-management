package com.akashpatel.usermanagement.services;
import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    UserResponseDto createUser(UserRequestDto user);
    List<UserResponseDto> getAllUser();
//    User getUserByID(UUID id);
//    User updateUser();
//    void deleteUser(UUID id);
}
