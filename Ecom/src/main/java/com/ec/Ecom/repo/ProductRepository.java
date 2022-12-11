package com.ec.Ecom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ec.Ecom.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	public List<Product> findAllByProductName(String productName);
}
