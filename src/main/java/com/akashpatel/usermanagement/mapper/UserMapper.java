package com.akashpatel.usermanagement.mapper;

import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;
import lombok.*;

public class UserMapper {
    public static UserResponseDto toDto(User user){
        return UserResponseDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .age(user.getAge())
                .gender(user.getGender())
                .build();
    }

    public static User toEntity(UserRequestDto userRequestDto){
        return User.builder()
                .name(userRequestDto.getName())
                .email(userRequestDto.getEmail())
                .age(userRequestDto.getAge())
                .gender(userRequestDto.getGender())
                .build();
    }
}
