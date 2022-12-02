package com.productmanagement.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.SpringBootCrud.bean.ProductManagementDao;

@Repository
public interface ProductManagementRepository extends CrudRepository<ProductManagementDao, Integer> {

}