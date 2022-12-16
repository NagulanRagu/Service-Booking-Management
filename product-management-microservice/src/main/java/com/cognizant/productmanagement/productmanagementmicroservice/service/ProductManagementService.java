package com.cognizant.productmanagement.productmanagementmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.productmanagement.productmanagementmicroservice.model.ProductManagement;
import com.cognizant.productmanagement.productmanagementmicroservice.repository.ProductManagementRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductManagementService {
    
    @Autowired
    ProductManagementRepository productManagementRepository;

    public ProductManagement saveProductManagement(ProductManagement newProductManagement){

        log.info("New Product {} is added.", newProductManagement);
        return productManagementRepository.save(newProductManagement);
    }

    public List<ProductManagement> getAllProductManagement() throws NullPointerException{

        log.info("Getting all the product details.");
        List<ProductManagement> allProductManagements = productManagementRepository.findAll();
        if(!allProductManagements.isEmpty()){
            log.info("All products are fetched from datebase.");
            return allProductManagements;
        }else{
            log.error("There is no Product in the Database.");
            throw new NullPointerException();
        }
    }

    public ProductManagement getById(long id) throws IllegalArgumentException{

        log.info("Product details for Id: {} is fetching from Database.", id);
        ProductManagement productManagement = productManagementRepository.findById(id);
        if(productManagement!=null){
            log.info("Product details for Id: {}", productManagement);
            return productManagement;
        }else{
            log.error("No product is found in Database for Id: {}.", productManagement);
            throw new IllegalArgumentException("No User for this Id.");
        }
    }

    public void deleteProductManagement(long id){

        log.info("Record of Id: {} is deleted from Database.", id);
        productManagementRepository.deleteById(id);
    }
}