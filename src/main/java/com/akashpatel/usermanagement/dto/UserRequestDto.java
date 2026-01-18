package com.akashpatel.usermanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class UserRequestDto {
    @NotBlank(message = "Name Required ")
    private String name;
    @Email
    @NotBlank(message = "Enter email")
    private String email;

    @NotBlank(message = "Please enter age")
    private int age;
    @NotBlank(message = "Male/Female/Others")
    private String gender;
}
