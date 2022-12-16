package com.cognizant.usermanagement.usermanagementmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usermanagement.usermanagementmicroservice.model.UserManagement;

public interface UserManagementRepository extends JpaRepository<UserManagement, Long> {

    UserManagement findById(long id);

    UserManagement findByName(String name);
}
