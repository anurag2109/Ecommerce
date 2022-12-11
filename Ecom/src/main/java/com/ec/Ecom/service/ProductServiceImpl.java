package com.ec.Ecom.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.Ecom.dto.Product;
import com.ec.Ecom.exceptions.InvalidIdException;
import com.ec.Ecom.exceptions.NoDataFoundException;
import com.ec.Ecom.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product insertProduct(Product product) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> updateProduct(int productId, Product product) throws NoDataFoundException {
		// TODO Auto-generated method stub
		if(productRepository.existsById(productId)) {
			Product prod = productRepository.findById(productId).get();
			
			
		}
		return Optional.empty();
	}

	@Override
	public Optional<Product> getProductByProductId(int productId) throws InvalidIdException {
		// TODO Auto-generated method stub
		return productRepository.findById(productId);
	}

	@Override
	public Optional<List<Product>> getAllProducts() throws InvalidIdException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(productRepository.findAll());
	}

	@Override
	public String deleteProductByProductId(int productId) throws NoDataFoundException {
		// TODO Auto-generated method stub
		try {
			if(productRepository.existsById(productId)) {
				productRepository.deleteById(productId);
				return "product deleted successfully !!";
			}
			else {
				throw new NoDataFoundException("product with this id is not present");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "failed to delete product";
	}

}
