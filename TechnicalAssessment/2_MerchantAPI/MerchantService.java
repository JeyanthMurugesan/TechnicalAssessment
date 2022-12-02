package com.merchantManagement.SpringBootCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.merchantManagement.SpringBootCrud.repository.MerchantRepository;

/*Service class*/
@Service
public class MerchantService{    
//Creating an instance variable for the interface repository - MerchantRepository
@Autowired
public MerchantRepository merchantRepo;    
public Merchant createMerchant(String name, String merchantId) {
	merchantRepo.save(name);
}
public void deleteMerchant(String merchantId){
	merchantRepo.deleteById(merchantId);
}
}