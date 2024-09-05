package com.kunleCode.secureNote.service;

import com.kunleCode.secureNote.dtos.UserDTO;
import com.kunleCode.secureNote.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
