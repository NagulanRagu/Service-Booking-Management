package com.cognizant.productmanagement.productmanagementmicroservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductManagement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String make;
    private String model;
    private String cost;
    private Date createdDate;
    
    public ProductManagement(String name, String make, String model, String cost, Date createdDate) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.cost = cost;
        this.createdDate = createdDate;
    }
}
