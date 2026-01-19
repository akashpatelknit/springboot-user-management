package com.akashpatel.usermanagement.services;
import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    UserResponseDto createUser(UserRequestDto user);
    List<UserResponseDto> getAllUser();
    UserResponseDto getUserByID(UUID id);
    UserResponseDto updateUser(UUID id, UserRequestDto userRequestDto);
    void deleteUser(UUID id);
}
