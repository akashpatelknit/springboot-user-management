package com.akashpatel.usermanagement.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserRequestDto {
    @NotBlank(message = "Name Required ")
    private String name;
    @Email
    @NotBlank(message = "Enter email")
    private String email;

    @NotNull(message = "Age is required")
    @Min(value = 1, message = "Age must be greater than 0")
    @Max(value = 120, message = "Age must be less than 120")
    private int age;
    @NotBlank(message = "Male/Female/Others")
    private String gender;
}
