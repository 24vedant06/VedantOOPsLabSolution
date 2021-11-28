package service;

import java.util.Random;

public class ServiceCredential {
	public String generateEmail(String fname, String lname, String department) {
		fname = fname.replaceAll("\\s", "");
		fname = fname.toLowerCase();
		lname = lname.replaceAll("\\s", "");
		lname = lname.toLowerCase();
		department = department.replaceAll("\\s", "");
		department = department.toLowerCase();
		String company = "Great Learning";
		company = company.replaceAll("\\s", "");
		company = company.toLowerCase();
		String email = fname + lname + "@" + department + "." + company + ".com";
		return email;
	}

	public char[] generatePassword() {
		int length = 8;
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "%&*!@#$";
		String numbers = "1234567890";
		String values = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		for (int i = 0; i < length; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public void showCredential(String email,char[] password) {
		System.out.println("email -----> "+email);
		System.out.print("password------> ");
		System.out.println(password);
	}
	
}
