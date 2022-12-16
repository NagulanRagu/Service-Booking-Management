package com.cognizant.usermanagement.usermanagementmicroservice.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.cognizant.usermanagement.usermanagementmicroservice.repository.UserManagementRepository;

@ContextConfiguration
@SpringBootTest
public class UserManagementServiceTest {
    
    @Mock
    UserManagementRepository userManagementRepository;

    @Mock
    UserManagementService userManagementService;

    @Test
    public void testSaveUserManagement(){
        
    }
}
