package com.bl.testingUserReg;

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
	
	//UC 11
	
	String[] strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

	
	//USE CASE 1------
	public String validateName(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";
		if(matchpattern(regex , s)) {
			return "true";
		}
		else {
			return "false";
		}		
	}
	
	//USE CASE 2------
	public String validateSurname(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
		if(matchpattern(regex , s)) {
			return "true";
		}
		else {
			return "false";
		}		
	}
	
	//USE CASE 3------
	public String validateEmail(String s) {
		String regex = "^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$";
		if(matchpattern(regex , s)) {
			return "true";
		}
		else {
			return "false";
		}		
	}
		
	//USE CASE 4------
	public String validateMobile(String s) {
		String regex = "^([0-9]{1,3}[ ][0-9]{10})$";
		if(matchpattern(regex , s)) {
			return "true";
		}
		else {
			return "false";
		}		
	}
				
	//USE CASE 7------
	public String validatePassword(String s) {
		String regex = "^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$";
		if(matchpattern(regex , s)) {
			return "true";
		}
		else {
			return "false";
		}		
	}
	
	//UC10
	
	public String validateUser(String name, String surname, String mobile, String email, String password) {
		if(matchpattern("(^[A-Z]{1}[a-z]{2,}$)",name)&&matchpattern("(^[A-Z]{1}[a-z]{2,}$)", surname)&&matchpattern("^([0-9]{1,3}[ ][0-9]{10})$", mobile)&&matchpattern("^[a-zA-Z0-9]+[-+.]?+[A-Za-z0-9]+[@]+[A-Za-z0-9]+[.][a-z]{2,}+[.]?+([a-z]{2,})?$", email)&&matchpattern("^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$", password)) {
			return "HAPPY";
		}
		else {
			return "SAD";
		}
	}
}
	
