package com.akashpatel.usermanagement.services;

import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;
import com.akashpatel.usermanagement.exception.ResourceNotFoundException;
import com.akashpatel.usermanagement.mapper.UserMapper;
import com.akashpatel.usermanagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @Override
    public UserResponseDto getUserByID(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + id)
                );

        return UserMapper.toDto(user);

    }

    @Override
    public UserResponseDto updateUser(UUID id, UserRequestDto userRequestDto) {
        User existUser= userRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("user not found by id : "+id));

        existUser.setAge(userRequestDto.getAge());
        existUser.setName(userRequestDto.getName());
        existUser.setGender(userRequestDto.getGender());
        existUser.setEmail(userRequestDto.getEmail());
        User updatedUser = userRepository.save(existUser);
        return UserMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id: " + id)
                );
        userRepository.delete(user);
    }


}
