package com.javapractice;

@SuppressWarnings("serial")
public class UserValidationException extends Exception{

	enum invalidCredentials{
		invalidFirstName,invalidLastName,invalidEmail,invalidMobileNumber,invalidPassword;
	}
	
	public invalidCredentials type;
	public UserValidationException(invalidCredentials type, String message) {
		super(message);
		this.type = type;
		System.out.println(message+ ". Please enter valid details");
	}
	
}


