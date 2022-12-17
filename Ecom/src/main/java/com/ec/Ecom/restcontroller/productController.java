package com.ec.Ecom.restcontroller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ec.Ecom.dto.Product;
import com.ec.Ecom.exceptions.InvalidIdException;
import com.ec.Ecom.exceptions.NoDataFoundException;
import com.ec.Ecom.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/product")
public class productController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@PostMapping("/addProduct")
	private ResponseEntity<?> insertProduct(@RequestBody Product product) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Product newProduct = productServiceImpl.insertProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
	}
	
	@GetMapping("/getProducts")
	private Optional<List<Product>> getProducts() throws InvalidIdException{
		return productServiceImpl.getAllProducts();
	}
	
	
	@GetMapping("/getProductsByCategory/{productCategory}")
	private Optional<List<Product>> getProductsByCategory(@PathVariable("productCategory") String productCategory) throws InvalidIdException {
		return productServiceImpl.getProductsByCategoryId(productCategory);
	}
	
	@GetMapping("/getProductById/{productId}")
	private Optional<Product> getProductbyProductId(@PathVariable("productId") int productId) throws InvalidIdException {
		return productServiceImpl.getProductByProductId(productId);
	}
	
	@PutMapping("/updateProductByproductId/{id}")
	private ResponseEntity<?> updateProductByProductId(@PathVariable("id") int id, @RequestBody Product product) throws NoDataFoundException {
		Optional<Product> optional =  productServiceImpl.updateProduct(id, product);
		return ResponseEntity.ok().body(optional.get());
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	private String deleteProduct(@PathVariable("id") int id) throws NoDataFoundException {
		// TODO Auto-generated method stub
		return productServiceImpl.deleteProductByProductId(id);

	}
}
