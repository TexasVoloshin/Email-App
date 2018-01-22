package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {

		System.out.println("Enter new member first name: ");
		Scanner in = new Scanner(System.in);
		String fName = in.nextLine();
		System.out.println("Enter new member last name: ");
		Scanner in2 = new Scanner(System.in);
		String lName = in2.nextLine();

		Email em1 = new Email(fName, lName);
		em1.showInfo();
		System.out.println(em1.showInfo());
	}

}
