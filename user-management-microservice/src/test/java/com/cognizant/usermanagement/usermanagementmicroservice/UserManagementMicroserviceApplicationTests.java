package com.cognizant.usermanagement.usermanagementmicroservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserManagementMicroserviceApplicationTests {

	@Mock
	UserManagementMicroserviceApplication userManagementMicroserviceApplication;

	@Test
	void contextLoads() {
		assertNotNull(userManagementMicroserviceApplication);
	}

}
