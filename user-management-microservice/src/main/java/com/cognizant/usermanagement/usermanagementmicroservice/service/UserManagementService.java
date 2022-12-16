package com.cognizant.usermanagement.usermanagementmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.usermanagement.usermanagementmicroservice.model.UserManagement;
import com.cognizant.usermanagement.usermanagementmicroservice.repository.UserManagementRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserManagementService {
    
    @Autowired
    UserManagementRepository userManagementRepository;

    public UserManagement saveUserManagement(UserManagement newUserManagement) {

        log.info("{} User Details are adding to Database.", newUserManagement);
        return userManagementRepository.save(newUserManagement);
    }

    public List<UserManagement> getAllUserManagement() throws NullPointerException{
        
        log.info("Getting all user details from database.");
        List<UserManagement> userManagements = userManagementRepository.findAll(); 
        if(!userManagements.isEmpty()){
            log.info("Total of number of users:{}", userManagementRepository.count());
            return userManagements;
        }else{
            log.error("No details find in database.");
            throw new NullPointerException();
        }
    }

    public UserManagement getUserManagementById(long id) throws IllegalArgumentException{

        log.info("Getting user details of Id: {} from database.", id);
        UserManagement userManagement = userManagementRepository.findById(id); 
        if(userManagement!=null){
            log.info("Details of Id: {} = {}", id, userManagement);
            return userManagement;
        }else{
            log.error("No details find in database for Id: {}.", id);
            throw new IllegalArgumentException("No User for this Id.");
        }
    }

    public UserManagement getUserByName(String name) throws IllegalArgumentException{

        log.info("Getting user details of Name: {} from database.", name);
        UserManagement userManagement = userManagementRepository.findByName(name); 
        if(userManagement!=null){
            log.info("Details of Name: {} = {}", name, userManagement);
            return userManagement;
        }else{
            log.error("No details find in database for Name: {}.", name);
            throw new IllegalArgumentException("No User for this Name.");
        }
    }

    public void deleteUserManagement(Long id){

        log.info("User details of Id: {} is removing from database", id);
        userManagementRepository.deleteById(id);
    }
}
