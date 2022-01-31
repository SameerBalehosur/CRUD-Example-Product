package com.te.crudexample.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.crudexample.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
