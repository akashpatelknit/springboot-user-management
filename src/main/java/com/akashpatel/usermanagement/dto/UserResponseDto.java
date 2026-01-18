package com.akashpatel.usermanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class UserResponseDto {
    private UUID id;
    private String name;
    private String email;
    private int age;
    private String gender;
}
