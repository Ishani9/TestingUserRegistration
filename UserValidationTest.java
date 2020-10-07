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
		
		assertEquals( "true", userValidation.validateName("Isha") );
		assertEquals( "true" , userValidation.validateName("Ishani"));	

		}
	
	@Test
	public void firstName_ifInvalid_shouldReturnFalse() {

		assertEquals( "invalidFirstName", userValidation.validateName("Is") );
		assertEquals( "invalidFirstName" , userValidation.validateName("ishani"));	
	}
	
	
	// UC 2
	
	@Test
	public void surName_ifValid_shouldReturnTrue() {
		assertEquals( "true", userValidation.validateSurname("Mhatre") );
		assertEquals( "true" , userValidation.validateSurname("Mha"));	
	}
	
	@Test
	public void surName_ifInvalid_shouldReturnFalse() {
		assertEquals( "invalidLastName", userValidation.validateSurname("Mh") );
		assertEquals( "invalidLastName" , userValidation.validateSurname("mhatre"));	
	}
	
	
	//UC 3
	
	@Test
	public void email_ifValid_shouldReturnTrue() {
		assertEquals( "true", userValidation.validateEmail("abc@yahoo.com") );
		assertEquals( "true" , userValidation.validateEmail("abc-100@yahoo.com"));
		assertEquals( "true" , userValidation.validateEmail("abc.100@yahoo.com"));
		assertEquals( "true" , userValidation.validateEmail("abc111@abc.com"));
		assertEquals( "true" , userValidation.validateEmail("abc-100@yabc.net"));
		assertEquals( "true" , userValidation.validateEmail("abc.100@abc.com.au"));
		assertEquals( "true" , userValidation.validateEmail("abc@gmail.com.com"));
		assertEquals( "true" , userValidation.validateEmail("abc+100@gmail.com"));
	}
	
	@Test
	public void email_ifInvalid_shouldReturnFalse() {
		assertEquals( "invalidEmail", userValidation.validateEmail("abc"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc@.com.my"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc123@gmail.a"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc123@.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc123@.com.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc()*.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc@%*.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc..2002@gmail.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc.@gmail.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc@abc@gmail.com"));
		assertEquals( "invalidEmail" , userValidation.validateEmail("abc@gmail.com.aa.au"));
	}
	
	//UC 4
	
		@Test
		public void mobile_ifValid_shouldReturnTrue() {
			assertEquals( "true", userValidation.validateMobile("981 1112223333") );
			assertEquals( "true" , userValidation.validateMobile("1 2223334444"));	
		}
		
		@Test
		public void mobile_ifInvalid_shouldReturnFalse() {
			assertEquals( "invalidMobileNumber", userValidation.validateMobile("999888777") );
			assertEquals( "invalidMobileNumber" , userValidation.validateMobile("9999 9997776665"));	
		}
		
	//UC 7
		
		@Test
		public void password_ifValid_shouldReturnTrue() {
			assertEquals( "true", userValidation.validatePassword("Abcdef123") );
			assertEquals( "true" , userValidation.validatePassword("ASDF12345"));	
		}
		
		@Test
		public void password_ifInvalid_shouldReturnFalse() {
			assertEquals( "invalidPassword", userValidation.validatePassword("2222") );
			assertEquals( "invalidPassword" , userValidation.validatePassword("Asdfghjkl"));	
		}
		
		
		
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
	/*
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
	*/
	
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
		

}