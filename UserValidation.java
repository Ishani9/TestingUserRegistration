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
		//USE CASE 1 COMPLETE------

}
