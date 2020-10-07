package com.javapractice;


import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class UserValidation {
	
	public boolean matchpattern(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(input);
		if(matcher.find()) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	//USE CASE 1------
	ValidateEntry validateFirstName = (String firstName) -> {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";
		
			if(matchpattern(regex , firstName)) {
				return "true";
			}
			else {
				throw new UserValidationException(UserValidationException.invalidCredentials.invalidFirstName, 
						"Invalid User name Details");
			}
	};	
	
	
	//USE CASE 2------
	ValidateEntry validateLastName = (String lastName) -> {
		
			if(matchpattern("(^[A-Z]{1}[a-z]{2,}$)" , lastName)) {
				return "true";
			}
			else {
				throw new UserValidationException(UserValidationException.invalidCredentials.invalidLastName, 
						"Invalid User last name Details");
			}
	};
	
	
	//USE CASE 3------
	ValidateEntry validateEmail = (String email) -> {	
			if(matchpattern("^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$" , email)) {
				return "true";
			}
			else {
				throw new UserValidationException(UserValidationException.invalidCredentials.invalidEmail, "Invalid User email Details");
			}		
		
	};
		
		
	//USE CASE 4------
	ValidateEntry validateMobile = (String mobile) -> {
					
			if(matchpattern("^([0-9]{1,3}[ ][0-9]{10})$" , mobile)) {
				return "true";
			}
			else {
				throw new UserValidationException(UserValidationException.invalidCredentials.invalidMobileNumber, "Invalid User mobile Details");
			}		
		};
		
	
				
	//USE CASE 7------
	ValidateEntry validatePassword = (String password) -> {
		
			if(matchpattern("^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$" , password)) {
				return "true";
			}
			else {
				throw new UserValidationException(UserValidationException.invalidCredentials.invalidPassword, "Invalid User password Details");
			}		
		};
		
}
/*		
		
		
	//UC10
	
	public String validateUser(String name, String surname, String mobile, String email, String password) {
		if(matchpattern("(^[A-Z]{1}[a-z]{2,}$)",name)&&matchpattern("(^[A-Z]{1}[a-z]{2,}$)", surname)
				&&matchpattern("^([0-9]{1,3}[ ][0-9]{10})$", mobile)
				&&matchpattern("^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$", email)
				&&matchpattern("^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$", password)) {
			return "HAPPY";
		}
		else {
			return "SAD";
		}
	}
	*/

	