package com.ec.Ecom.dto;


import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	@GeneratedValue
	private String productId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductCategory.productCategoryId")
	private String productCategoryId;
	
	@NotNull
	private String productName;
	@NotNull
	private String description;
	@NotNull
	private float price;
	@NotNull
	private int quantityInStock;
	@NotNull
	private String[] productImages;
}
