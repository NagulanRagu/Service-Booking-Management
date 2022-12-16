package com.cognizant.usermanagement.usermanagementmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.usermanagement.usermanagementmicroservice.model.UserManagement;
import com.cognizant.usermanagement.usermanagementmicroservice.pojo.LoginDetails;
import com.cognizant.usermanagement.usermanagementmicroservice.service.UserManagementService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class UserManagementController {

    @Autowired
    UserManagementService userManagementService;

    @PostMapping("/")
    public ResponseEntity<?> signup(@RequestBody UserManagement userManagement) {

        UserManagement addedUserManagement = userManagementService.saveUserManagement(userManagement);
        return ResponseEntity.ok().body(addedUserManagement);
    }

    @PutMapping("/")
    public ResponseEntity<?> updateUser(@RequestBody UserManagement userManagement) {

        UserManagement updatedUserManagement = userManagementService.saveUserManagement(userManagement);
        return ResponseEntity.ok().body(updatedUserManagement);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllUser() {
        List<UserManagement> allUsers = userManagementService.getAllUserManagement();
        return ResponseEntity.ok().body(allUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id) {

        UserManagement userManagement = userManagementService.getUserManagementById(id);
        return ResponseEntity.ok().body(userManagement);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDetails loginDetails) {

        UserManagement userManagement = userManagementService.getUserByName(loginDetails.getUsername());
        if (userManagement.getPassword().equals(loginDetails.getPassword())) {
            log.info("Login is Successfull.");
            return ResponseEntity.ok().body("login is successfull");
        } else {
            log.error("Password is wrong");
            return ResponseEntity.badRequest().body("Wrong login crenditails");
        }
    }
}
