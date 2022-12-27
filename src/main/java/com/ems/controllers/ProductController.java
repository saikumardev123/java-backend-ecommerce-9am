package com.ems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Product;
import com.ems.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {

	
	@Autowired
	  ProductService productService;
	
	@PostMapping("/add")
	 public void add(@RequestBody Product product) {
		
		      
		   productService.add(product);
	 }
	
	@PutMapping("/update")
	 public void update(@RequestBody Product product) {
		
		     
		   productService.update(product);
	 }
	@DeleteMapping("/delete")
	public void delete(@RequestBody Product product) {
		System.out.println("controller");
		productService.delete(product.getId());
	}
	
	
}
