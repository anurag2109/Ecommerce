package com.ec.Ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String userId;
	private String email;
	private String password;
	private String phoneNumber;
	private String firstName;
	private String lastName;

}
