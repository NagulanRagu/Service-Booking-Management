package com.cognizant.usermanagement.usermanagementmicroservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDetails {
    
    private String username;
    private String password;
}
