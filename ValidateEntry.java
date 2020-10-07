package com.javapractice;

@FunctionalInterface
interface ValidateEntry{
	String validate(String check) throws UserValidationException;
}