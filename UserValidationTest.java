package com.bl.testingUserReg;

import static org.junit.Assert.*;
import org.junit.Test;


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
		assertEquals( "false", userValidation.validateName("Is") );
		assertEquals( "false" , userValidation.validateName("ishani"));	
	}
	
	// UC 2
	
	@Test
	public void surName_ifValid_shouldReturnTrue() {
		assertEquals( "true", userValidation.validateSurname("Mhatre") );
		assertEquals( "true" , userValidation.validateSurname("Mha"));	
	}
	
	@Test
	public void surName_ifInvalid_shouldReturnFalse() {
		assertEquals( "false", userValidation.validateSurname("Mh") );
		assertEquals( "false" , userValidation.validateSurname("mhatre"));	
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
		assertEquals( "false", userValidation.validateEmail("abc"));
		assertEquals( "false" , userValidation.validateEmail("abc@.com.my"));
		assertEquals( "false" , userValidation.validateEmail("abc123@gmail.a"));
		assertEquals( "false" , userValidation.validateEmail("abc123@.com"));
		assertEquals( "false" , userValidation.validateEmail("abc123@.com.com"));
		assertEquals( "false" , userValidation.validateEmail("abc()*.com"));
		assertEquals( "false" , userValidation.validateEmail("abc@%*.com"));
		assertEquals( "false" , userValidation.validateEmail("abc..2002@gmail.com"));
		assertEquals( "false" , userValidation.validateEmail("abc.@gmail.com"));
		assertEquals( "false" , userValidation.validateEmail("abc@abc@gmail.com"));
		assertEquals( "false" , userValidation.validateEmail("abc@gmail.com.aa.au"));
	}
	
	//UC 4
	
		@Test
		public void mobile_ifValid_shouldReturnTrue() {
			assertEquals( "true", userValidation.validateMobile("981 1112223333") );
			assertEquals( "true" , userValidation.validateMobile("1 2223334444"));	
		}
		
		@Test
		public void mobile_ifInvalid_shouldReturnFalse() {
			assertEquals( "false", userValidation.validateMobile("999888777") );
			assertEquals( "false" , userValidation.validateMobile("9999 9997776665"));	
		}
		
	//UC 7
		
		@Test
		public void password_ifValid_shouldReturnTrue() {
			assertEquals( "true", userValidation.validatePassword("Abcdef123") );
			assertEquals( "true" , userValidation.validatePassword("ASDF12345"));	
		}
		
		@Test
		public void password_ifInvalid_shouldReturnFalse() {
			assertEquals( "false", userValidation.validatePassword("2222") );
			assertEquals( "false" , userValidation.validatePassword("Asdfghjkl"));	
		}
		
		
	

}
