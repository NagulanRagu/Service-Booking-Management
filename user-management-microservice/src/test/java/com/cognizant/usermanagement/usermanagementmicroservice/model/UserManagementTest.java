package com.cognizant.usermanagement.usermanagementmicroservice.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@SpringBootTest
public class UserManagementTest {
    
    @Mock
    UserManagement userManagement = new UserManagement();

    @Test
    public void testUserManagementNoArgConstructor(){

        assertNotNull(userManagement);
    }

    @Test
    public void testUserManagementArgConstructor(){

        UserManagement testUserManagement = new UserManagement("Nagulan R U", "1234", "runagulan88@gmail.com", "8870323658", new Date());
        assertEquals("Nagulan R U", testUserManagement.getName());
    }

    @Test
    public void testName(){

        userManagement.setName("Nagulan R U");
        assertEquals("Nagulan R U", userManagement.getName());
    }

    @Test
    public void testPassword(){

        userManagement.setPassword("1234");
        assertEquals("1234", userManagement.getPassword());
    }

    @Test
    public void testEmail(){

        userManagement.setEmail("runagulan88@gmail.com");
        assertEquals("runagulan88@gmail.com", userManagement.getEmail());
    }

    @Test
    public void testPhoneNo(){

        userManagement.setPhoneNo("8870323658");
        assertEquals("8870323658", userManagement.getPhoneNo());
    }

    @Test
    public void testRegistrationDate(){

        userManagement.setRegistrationDate(new Date());
        assertEquals(new Date(), userManagement.getRegistrationDate());
    }
}
