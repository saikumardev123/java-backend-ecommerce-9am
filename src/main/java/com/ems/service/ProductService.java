package com.ems.service;

import java.util.List;

import com.ems.model.Product;

public interface ProductService {
	
	public void add(Product product);
	public List<Product> get();
	public Product getByid(int id);
	public void update(Product product);
	public void delete(int id);

}
