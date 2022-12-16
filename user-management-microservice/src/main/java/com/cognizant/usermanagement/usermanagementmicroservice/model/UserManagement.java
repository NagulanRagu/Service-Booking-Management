package com.cognizant.usermanagement.usermanagementmicroservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserManagement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String password;
    private String email;
    private String phoneNo;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date registrationDate;
    public UserManagement(String name, String password, String email, String phoneNo, Date registrationDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.registrationDate = registrationDate;
    }
}
