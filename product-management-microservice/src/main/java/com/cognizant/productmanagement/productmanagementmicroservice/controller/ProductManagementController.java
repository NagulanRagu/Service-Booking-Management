package com.cognizant.productmanagement.productmanagementmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.productmanagement.productmanagementmicroservice.model.ProductManagement;
import com.cognizant.productmanagement.productmanagementmicroservice.service.ProductManagementService;

@RestController
@RequestMapping("/product")
public class ProductManagementController {

    @Autowired
    ProductManagementService productManagementService;

    @GetMapping("/")
    public ResponseEntity<?> getAllProductDetails(){

        List<ProductManagement> productDetailList = productManagementService.getAllProductManagement();
        return ResponseEntity.ok().body(productDetailList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){

        ProductManagement productManagement = productManagementService.getById(id);
        return ResponseEntity.ok().body(productManagement);
    }

    @PostMapping("/")
    public ResponseEntity<?> addProductDetail(@RequestBody ProductManagement newProductManagement){

        ProductManagement addedProductManagement = productManagementService.saveProductManagement(newProductManagement);
        return ResponseEntity.ok().body(addedProductManagement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletedProductDetail(@PathVariable Long id){

        productManagementService.deleteProductManagement(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/")
    public ResponseEntity<?> updateProductDetail(@RequestBody ProductManagement newProductManagement){

        ProductManagement updatedProductManagement = productManagementService.saveProductManagement(newProductManagement);
        return ResponseEntity.ok().body(updatedProductManagement);
    }
}
