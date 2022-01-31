package com.te.crudexample.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.crudexample.product.entity.Product;
import com.te.crudexample.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
		
	}
	
	public List<Product> saveProducts(List<Product> list) {
		return repository.saveAll(list);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
		
	}
	
	public Product getProduct(int id){
		return repository.findById(id).orElse(null);
		
	}
	
	public Product getProductByName(String name){
		return repository.findByName(name);
		
	}
	
	public String deleteProduct(int id){
		 repository.deleteById(id);
		 return "Data deleted"+id;
	}
	public Product updateProduct(Product product){
		Product exstingproduct = repository.findById(product.getId()).orElse(null);
		exstingproduct.setName(product.getName());
		exstingproduct.setId(product.getId());
		exstingproduct.setPrice(product.getPrice());
		exstingproduct.setQuantity(product.getQuantity());
		return repository.save(exstingproduct);
		
	}
	
}
