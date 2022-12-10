package com.ec.Ecom.dto;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	@Id
	@GeneratedValue
	private String userId;
	
	@NotNull
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private String phoneNumber;
	
	@NotNull
	private String firstName;
	private String lastName;

}
