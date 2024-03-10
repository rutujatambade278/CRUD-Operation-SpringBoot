package com.project.ecommerce.controller;

import com.project.ecommerce.entity.Product;
import com.project.ecommerce.repository.Product_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*"
		+ "")
@RequestMapping("product")
public class Product_Contoller {
    @Autowired
    Product_Repo productRepo;

    @PostMapping("/added")
    public Product insert(@RequestBody Product product) {
    productRepo.save(product);
       return product;
    
    }
    
    @GetMapping("/show")
    List<Product> getAllStudent() {
        return productRepo.findAll();
    }
    
    
//    @PutMapping("/update")
//    public Product Update(@RequestBody Product product) {
//    	return productRepo.save(product);
//    }
//    
//    @GetMapping("/get_product/{id}")
//    private Product getproduct(@PathVariable("id") int id)   
//    {  
//    return productRepo.getById(id);  
//    }  
    
    @DeleteMapping("/{id}")
    public void deleteId(int id) {
    	productRepo.deleteById(id);
    	}
}