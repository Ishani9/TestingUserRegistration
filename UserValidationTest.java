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

	

}
