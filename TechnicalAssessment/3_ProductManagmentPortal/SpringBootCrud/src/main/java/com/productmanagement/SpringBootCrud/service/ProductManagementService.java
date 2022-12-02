package com.productmanagement.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.SpringBootCrud.bean.ProductManagementDao;
import com.productmanagement.SpringBootCrud.repository.ProductManagementRepository;

@Service
public class ProductManagementService {
    @Autowired
    public ProductManagementRepository productManagementRepo;
    
    public List<ProductManagementDao> getAllProducts(){
        List<ProductManagementDao> products = new ArrayList<>();
        productManagementRepo.findAll().forEach(products::add);
        return products;
    }

   public void addProduct(ProductManagementDao product) {
        productManagementRepo.save(product);
    }

   public void updateProduct(Integer productId, ProductManagementDao product) {
        productManagementRepo.save(product);
    }

   public void deleteProduct(Integer productId) {
        productManagementRepo.deleteById(productId);
        
    }

}