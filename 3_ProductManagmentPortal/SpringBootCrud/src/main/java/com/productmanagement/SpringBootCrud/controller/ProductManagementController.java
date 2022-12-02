package com.productmanagement.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.SpringBootCrud.bean.ProductManagementDao;
import com.productmanagement.SpringBootCrud.service.ProductManagementService;

@RestController
public class ProductManagementController {
	@Autowired
	private ProductManagementService productManagementService;
	
	@RequestMapping(method = RequestMethod.GET, value="/products")
	public List<ProductManagementDao> getAllProducts(){
		//Calling service class
		return productManagementService.getAllProducts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody ProductManagementDao product) {
		productManagementService.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.POST, value="/products/{productId}")
	public void addProduct(@PathVariable Integer productId, @RequestBody ProductManagementDao product) {
		productManagementService.addProduct(product);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/products/{productId}")
	public void updateProduct(@PathVariable Integer productId, @RequestBody ProductManagementDao product) {
		productManagementService.updateProduct(productId, product);
	}
 
 	@RequestMapping(method = RequestMethod.DELETE, value="/products/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
 		productManagementService.deleteProduct(productId);
 	}
}
