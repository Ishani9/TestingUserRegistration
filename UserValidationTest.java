package com.javapractice;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameter;


public class UserValidationTest {
	
	UserValidation userValidation = new UserValidation();

	//UC1
	
	@Test
	public void firstName_ifValid_shouldReturnTrue() {
		try {
			assertEquals( "true", userValidation.validateFirstName.validate("Isha") );
			assertEquals( "true" , userValidation.validateFirstName.validate("Ishani"));	

		}
		catch(UserValidationException e){
		}
			
	}
	
	@Test
	public void firstName_ifInvalid_shouldReturnFalse() {
		try {
			assertEquals( "invalidFirstName", userValidation.validateFirstName.validate("Is") );
			assertEquals( "invalidFirstName" , userValidation.validateFirstName.validate("ishani"));	
		}
		catch(UserValidationException e) {
			
		}
	}
	
	
	// UC 2
	
	@Test
	public void surName_ifValid_shouldReturnTrue() {
		try {
			assertEquals( "true", userValidation.validateLastName.validate("Mhatre") );
			assertEquals( "true" , userValidation.validateLastName.validate("Mha"));	
		}
		catch(UserValidationException e){
		}
			
	}
	
	@Test
	public void surName_ifInvalid_shouldReturnFalse() {
		try {
			assertEquals( "invalidLastName", userValidation.validateLastName.validate("Mh") );
			assertEquals( "invalidLastName" , userValidation.validateLastName.validate("mhatre"));	
		}
		catch(UserValidationException e){
		}
			
	}
	
	
	//UC 3
	
	@Test
	public void email_ifValid_shouldReturnTrue() {
		try {
			assertEquals( "true", userValidation.validateEmail.validate("abc@yahoo.com") );
			assertEquals( "true" , userValidation.validateEmail.validate("abc-100@yahoo.com"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc.100@yahoo.com"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc111@abc.com"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc-100@yabc.net"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc.100@abc.com.au"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc@gmail.com.com"));
			assertEquals( "true" , userValidation.validateEmail.validate("abc+100@gmail.com"));
		}
		catch(UserValidationException e){
		}
			
	}
	
	@Test
	public void email_ifInvalid_shouldReturnFalse() {
		try {
			assertEquals( "invalidEmail", userValidation.validateEmail.validate("abc"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc@.com.my"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc123@gmail.a"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc123@.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc123@.com.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc()*.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc@%*.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc..2002@gmail.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc.@gmail.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc@abc@gmail.com"));
			assertEquals( "invalidEmail" , userValidation.validateEmail.validate("abc@gmail.com.aa.au"));
		}
		catch(UserValidationException e){
		}
			
	}
	
	//UC 4
	
		@Test
		public void mobile_ifValid_shouldReturnTrue() {
			try {
				assertEquals( "true", userValidation.validateMobile.validate("981 1112223333") );
				assertEquals( "true" , userValidation.validateMobile.validate("1 2223334444"));	
			}
			catch(UserValidationException e){
			}
				
		}
		
		@Test
		public void mobile_ifInvalid_shouldReturnFalse() {
			try {
				assertEquals( "invalidMobileNumber", userValidation.validateMobile.validate("999888777") );
				assertEquals( "invalidMobileNumber" , userValidation.validateMobile.validate("9999 9997776665"));	
			}
			catch(UserValidationException e){
			}
				
		}
		
	//UC 7
		
		@Test
		public void password_ifValid_shouldReturnTrue() {
			try {
				assertEquals( "true", userValidation.validatePassword.validate("Abcdef123") );
				assertEquals( "true" , userValidation.validatePassword.validate("ASDF12345"));	
			}
			catch(UserValidationException e){
			}
				
		}
		
		@Test
		public void password_ifInvalid_shouldReturnFalse() {
			try {
				assertEquals( "invalidPassword", userValidation.validatePassword.validate("2222") );
				assertEquals( "invalidPassword" , userValidation.validatePassword.validate("Asdfghjkl"));	
			}
			catch(UserValidationException e){
			}
				
		}
		
		/*
		
	//UC 10
	
	@Test
	public void userEntry_ifValid_shouldReturnHappy() {
		String name = "Ishani";
		String surname = "Mhatre";
		String mobile = "91 2223334445";
		String email = "abc+100@gmail.com";
		String password = "ASDF@23456";
		assertEquals("HAPPY", userValidation.validateUser(name, surname, mobile, email, password));
	}
	
	@Test
	public void userEntry_ifInvalid_shouldReturnSad() {
		String name = "IS";
		String surname = "mhatre";
		String mobile = "99995 77755";
		String email = "abc+100@gmail.com.ac.in";
		String password = "aaaabbb222";
		assertEquals("SAD", userValidation.validateUser(name, surname, mobile, email, password));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void multipleEmail_ifValid_shouldReturnValidss(String validEmails) {
		assertEquals("true", userValidation.validateEmail(validEmails));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void multipleEmail_ifInvalid_shouldReturnInvalidss(String invalidEmails) {
		assertEquals("invalidEmail", userValidation.validateEmail(invalidEmails));	
	}
	
	
	//UC 11
	@ParameterizedTest
	@ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
			"abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
	public void multipleEmail_ifValid_shouldReturnValidss(String[] e) {
		for(int i=0; i<e.length; i++) {
			assertEquals("true", userValidation.validateEmail(e[i]));
		}
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", 
			"abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
	public void multipleEmail_ifInvalid_shouldReturnInvalidss(String[] ie) {
		for(int i=0; i<ie.length; i++) {
			assertEquals("invalidEmail", userValidation.validateEmail(ie[i]));
		}
	}
	*/
		

}