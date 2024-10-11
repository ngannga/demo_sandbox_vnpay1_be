package com.example.demo_sandbox_be.util;

import com.example.demo_sandbox_be.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    private String name;
    private String email;
    private String phone;
    private String password;
    private Role role;
    private boolean mfaEnabled;

}
