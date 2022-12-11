package com.ec.Ecom.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


import com.ec.Ecom.dto.Product;
import com.ec.Ecom.exceptions.InvalidIdException;
import com.ec.Ecom.exceptions.NoDataFoundException;

public interface ProductService {
	public Product insertProduct(Product product) throws  FileNotFoundException, IOException;
    public Optional<Product> updateProduct(int productId, Product product) throws NoDataFoundException;

    public Optional<Product> getProductByProductId(int productId) throws  InvalidIdException;
    public Optional<List<Product>> getAllProducts() throws InvalidIdException;
    public String deleteProductByProductId(int productId) throws NoDataFoundException;
}
