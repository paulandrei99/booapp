package com.paulprojects.booapp.service;

import com.paulprojects.booapp.dto.UserDTO;
import com.paulprojects.booapp.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserSvc extends UserDetailsService {
    User save(UserDTO userDTO);
}
