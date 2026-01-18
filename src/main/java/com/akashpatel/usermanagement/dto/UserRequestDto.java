package com.akashpatel.usermanagement.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserRequestDto {
    private String name;
    private String email;
    private int age;
    private String gender;
}
