package com.example.demo.utility;

package com.example.demo.util;

import com.example.demo.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.Collections;

public class UserRoleConverter {
    public static Collection<? extends GrantedAuthority> convertToAuthorities(UserRole role) {
        // Implement the logic to convert UserRole to GrantedAuthority
        // For simplicity, I'll use a basic conversion
        return Collections.singleton(new SimpleGrantedAuthority(role.name()));
    }
}
