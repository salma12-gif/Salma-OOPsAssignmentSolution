package com.itAdministrator.credentialService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CredentialService {

	private String generatePassword() {
		String str = getRandomUpperCaseString(2)+getRandomLowerCaseString(2)
						+getRandomNumericString(3)+getRandomSpecialCharacterString(1);
		List<String> letters = Arrays.asList(str.split(""));
		  Collections.shuffle(letters);
		  String shuffled = "";
		  for (String letter : letters) {
		    shuffled += letter;
		  }
		  return shuffled;
	}

	private String getRandomUpperCaseString(int length) {
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = (int) (string.length() * Math.random());
			sb.append(string.charAt(index));
		}
		
		return sb.toString();
	}
	
	private String getRandomLowerCaseString(int length) {
		String string = "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = (int) (string.length() * Math.random());
			sb.append(string.charAt(index));
		}
		
		return sb.toString();
	}
	
	private String getRandomNumericString(int length) {
		String string = "0123456789";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = (int) (string.length() * Math.random());
			sb.append(string.charAt(index));
		}
		
		return sb.toString();
	}
	
	private String getRandomSpecialCharacterString(int length) {
		String string = "@!#$&*.";

		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int index = (int) (string.length() * Math.random());
			sb.append(string.charAt(index));
		}
		
		return sb.toString();
	}
	
	private String generateEmailAddress(String firstName, String lastName,String department) {
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+".abc.com";
	}
	
	public void showCredentials(String firstName, String lastName,String department) {
		String email;
		String password;
		System.out.println("Dear "+firstName+" your generated credentails are as follows");
		System.out.println("Email    --->  "+generateEmailAddress(firstName,lastName,department));
		System.out.println("Password    --->  "+generatePassword());
	}
}
