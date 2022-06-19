package com.driverTest;

import java.util.Scanner;

import com.itAdministrator.admin.*;
import com.itAdministrator.employee.*;
import com.itAdministrator.hr.*;
import com.itAdministrator.legal.*;
import com.itAdministrator.technical.*;
import com.itAdministrator.credentialService.*;

public class Driver {

	public static void main(String[] args) {
		
		//System.out.println("\n");		
		Employee employee = new Employee("Salma","Pathan");
		String firstName = employee.getFirstName();
		//System.out.println(firstName);
		String lastName = employee.getLastName();
		//System.out.println(lastName);
		
		CredentialService cs = new CredentialService();
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin ");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			cs.showCredentials(firstName, lastName, "tech");
			break;
		case 2:
			cs.showCredentials(firstName, lastName, "admin");
			break;
		case 3:
			cs.showCredentials(firstName, lastName, "hr");
			break;
		case 4:
			cs.showCredentials(firstName, lastName, "legal");
			break;
		default:
			System.out.println("Invalid input provided. Please provide option in (1/2/3/4)");	
			
		}
				
		
	}

}
