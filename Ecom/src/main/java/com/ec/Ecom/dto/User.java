package com.ec.Ecom.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	@Id
	@GeneratedVa
	private String userId;
	private String email;
	private String password;
	private String phoneNumber;
	private String firstName;
	private String lastName;

}
