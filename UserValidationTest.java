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
		assertEquals( "true", userValidation.validateEmail("abc.xyz@bl.co.in") );
		assertEquals( "true" , userValidation.validateEmail("abc.wxyzzz@bl.co.uk"));	
	}
	
	@Test
	public void email_ifInvalid_shouldReturnFalse() {
		assertEquals( "false", userValidation.validateEmail("ab.xyz@bl.co.in") );
		assertEquals( "false" , userValidation.validateEmail("abc.xyz@bl.com"));	
	}


	

}
