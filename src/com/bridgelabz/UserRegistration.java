package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: (mimmum three character that starts with upper case) ");
		String firstName = sc.next();
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher m = p.matcher(firstName);
		Boolean result = m.matches();
		if (result) {
			System.out.println("First Name is valid");
		} else
			System.out.println("First Name is Invalid");
	}

}
