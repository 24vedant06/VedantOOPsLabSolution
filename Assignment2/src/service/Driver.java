package service;

import java.util.Scanner;

import model.Employee;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name : ");
		String lastName = sc.nextLine();

		Employee employee = new Employee(firstName, lastName);
		System.out.println("Enter the following options to select the department");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		int choice = sc.nextInt();
		String department = "";

		switch (choice) {
		case 1:
			department = "Tech";
			break;
		case 2:
			department = "Admin";
			break;
		case 3:
			department = "HR";
			break;
		case 4:
			department = "Legal";
			break;
		default:
			System.out.println("Enter the correct Credentials");
			break;
		}
		ServiceCredential generate = new ServiceCredential();
		String email = generate.generateEmail(firstName,lastName,department);
		char[] password = generate.generatePassword();
		generate.showCredential(email,password);
		

	}

}
