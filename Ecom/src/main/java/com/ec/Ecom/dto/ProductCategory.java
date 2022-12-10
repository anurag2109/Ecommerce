package com.ec.Ecom.dto;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductCategory {
	
	@Id
	@GeneratedValue
	private String productCategoryId;
	private String productCategoryName;
}
