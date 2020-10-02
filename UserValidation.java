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
	
		
	

}
