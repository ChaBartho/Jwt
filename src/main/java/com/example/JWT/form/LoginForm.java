package com.example.JWT.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginForm {
    @NotNull
    private String username;
    @NotNull
    private String password;

}

