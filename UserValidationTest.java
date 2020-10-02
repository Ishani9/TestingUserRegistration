package com.bl.testingUserReg;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;


public class UserValidationTest {
	
	UserValidation userValidation = new UserValidation();
	
	
	//UC 11
	@Test
	public void multipleEmail_ifValid_shouldReturnValid() {
		
		String[] valid_email;
		valid_email =  new String[]{"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
			
		for(int i=0; i<valid_email.length; i++) {
			assertEquals("true", userValidation.validateEmail(valid_email[i]));		
		}
	}
	@Test
	public void multipleEmail_ifInvalid_shouldReturnInvalid() {
			
		String[] invalid_email;
		invalid_email =  new String[]{"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
		for(int i=0; i<invalid_email.length; i++) {
			assertEquals("false", userValidation.validateEmail(invalid_email[i]));		
		}	
	}
		
	
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

}
