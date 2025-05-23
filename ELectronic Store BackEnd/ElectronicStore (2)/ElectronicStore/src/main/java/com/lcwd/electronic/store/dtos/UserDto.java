package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {


    //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String   userId;

    @Size(min = 3, max = 20, message = "Invalid Name !!")
    private String name;

    @NotBlank(message = "Email is required !!")
    @Pattern(regexp = "^[a-z0-9][-a-z0-9._]+@([-a-z0-9]+\\.)+[a-z]{2,5}$", message = "Invalid User Email !!")
    private String email;

    @NotBlank(message = "Password is required !!")
    private String password;

    @Size(min = 4, max = 6, message = "Invalid gender !!")
    private String gender;

    @NotBlank(message = "Write something about yourself !!")
    private String about;

    @ImageNameValid
    private String imageName;


    private List<RoleDto> roles;

//    @Pattern
//    Custom validator

}
