package com.cognizant.productmanagement.productmanagementmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.productmanagement.productmanagementmicroservice.model.ProductManagement;

public interface ProductManagementRepository extends JpaRepository<ProductManagement, Long> {
    
    ProductManagement findById(long id);
}
