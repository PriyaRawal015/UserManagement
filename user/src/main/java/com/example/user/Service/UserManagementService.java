package com.example.user.Service;

import java.util.UUID;

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
  
   
   // ListUserResponseDTO listUsers(String filter, int startIndex, int count);

    // CreateUserResponseDTO updateUser(String id, UpdateUserRequestDTO requestDTO);

   
    ShowUserDetailResponseDTO showUserDetails(UUID id);

    // void deleteUser(String id);

} 

