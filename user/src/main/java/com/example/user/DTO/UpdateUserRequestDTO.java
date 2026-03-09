package com.example.user.DTO;

import lombok.Data;
import java.util.List;

@Data
public class UpdateUserRequest {
     private List<String> schemas;
    private List<OperationDTO> Operations;
    
}

