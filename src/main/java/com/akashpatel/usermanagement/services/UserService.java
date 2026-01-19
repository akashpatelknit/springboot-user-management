package com.akashpatel.usermanagement.services;

import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;
import com.akashpatel.usermanagement.mapper.UserMapper;
import com.akashpatel.usermanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final UserRepository userRepository;

    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = UserMapper.toEntity(userRequestDto);
        User savedUser = userRepository.save(user);
        return UserMapper.toDto(savedUser);
    }

    @Override
    public List<UserResponseDto> getAllUser() {
        List<User> listOfUser = userRepository.findAll();
        List<UserResponseDto> responseDtos = new ArrayList<>();
        for( User u:listOfUser){

            responseDtos.add(UserMapper.toDto(u));
        }
        return responseDtos;
    }

}
