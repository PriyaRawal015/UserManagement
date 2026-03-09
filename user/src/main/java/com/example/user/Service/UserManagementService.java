package com.example.user.Service;

import com.example.user.DTO.CreateUserRequestDTO;
import com.example.user.DTO.CreateUserResponseDTO;
import com.example.user.DTO.UpdateUserRequestDTO;
import com.example.user.DTO.ListUserResponseDTO;
import com.example.user.DTO.ShowUserDetailResponseDTO;

public interface UserManagementService {

    /**
     * Create a new user
     */
    CreateUserResponseDTO createUser(CreateUserRequestDTO requestDTO);

    /**
     * Fetch list of users 
     */
    ListUserResponseDTO listUsers(String filter, int startIndex, int count);

    /**
     * Update user information
     */
    CreateUserResponseDTO updateUser(String id, UpdateUserRequestDTO requestDTO);

    /**
     * Fetch user details by ID
     */
    ShowUserDetailResponseDTO showUserDetails(String id);

    /**
     * Delete user by ID
     */
    void deleteUser(String id);
}
