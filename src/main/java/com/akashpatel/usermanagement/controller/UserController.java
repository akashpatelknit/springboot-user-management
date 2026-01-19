package com.akashpatel.usermanagement.controller;

import com.akashpatel.usermanagement.dto.UserRequestDto;
import com.akashpatel.usermanagement.dto.UserResponseDto;
import com.akashpatel.usermanagement.entity.User;
import com.akashpatel.usermanagement.exception.ResourceNotFoundException;
import com.akashpatel.usermanagement.services.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;

    @PostMapping
    public UserResponseDto createUser(@Valid @RequestBody UserRequestDto userRequestDto){
        System.out.println("ENDPOINT Hitting");
        return userService.createUser(userRequestDto);
    }

    @GetMapping
    public List<UserResponseDto> getAllUser(){
        System.out.println("ENDPOINT Hitting");
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserByID(@PathVariable UUID id){
        return userService.getUserByID(id);

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public UserResponseDto updateUser(@PathVariable UUID id,@Valid @RequestBody UserRequestDto userRequestDto){
        return userService.updateUser(id,userRequestDto);
    }
}
