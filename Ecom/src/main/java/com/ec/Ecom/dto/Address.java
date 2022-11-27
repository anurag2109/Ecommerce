package com.ec.Ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
	private String addressId;
	private String streetNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String region;
	private String postalCode;
	private String country;
}
