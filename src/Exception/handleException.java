package Exception;

import java.util.Scanner;

public class handleException {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);

		System.out.println("Program is started...");

		//Example 1
		System.out.println("Enter a nunber: ");
		int n=scn.nextInt();
		
		try {
		System.out.println(100/n);  
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Data...");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");


	}

}
