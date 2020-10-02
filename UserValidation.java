package com.bl.testingUserReg;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidation {
	
	//USE CASE 1------
	public String validateName(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(s);
		if (matcher.find()) {
			return "true";
		}
		else {
			return "false";
		}			
	}
	
	//USE CASE 2------
	public String validateSurname(String s) {
		String regex = "(^[A-Z]{1}[a-z]{2,}$)";	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(s);
		if (matcher.find()) {
			return "true";
		}
		else {
			return "false";
		}			
	}
	
	//USE CASE 3------
		public String validateEmail(String s) {
			String regex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher= pattern.matcher(s);
			if (matcher.find()) {
				return "true";
			}
			else {
				return "false";
			}			
		}
		
		//USE CASE 4------
				public String validateMobile(String s) {
					String regex = "^([0-9]{1,3}[ ][0-9]{10})$";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher= pattern.matcher(s);
					if (matcher.find()) {
						return "true";
					}
					else {
						return "false";
					}			
				}
				
		//USE CASE 7------
				public String validatePassword(String s) {
					String regex = "^((?=.*[A-Z]+)(?=.*[0-9]+)([A-Za-z0-9@#$%^&*]{8,}))$";
					Pattern pattern = Pattern.compile(regex);
					Matcher matcher= pattern.matcher(s);
					if (matcher.find()) {
						return "true";
					}
					else {
						return "false";
					}			
				}
	
	
		
	

}
