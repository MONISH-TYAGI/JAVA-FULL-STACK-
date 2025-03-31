package com.codeWithProjects.ecom.dto;


import lombok.Data;

@Data
public class SignupRequest {
    private String email;
    private String password;
    private String name;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
    return this.password;
    }
}
