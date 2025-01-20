package Exception;

import java.util.Scanner;

public class exceptionDemo {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);

		System.out.println("Program is started...");

		/*
		//Example 1
		System.out.println("Enter a nunber: ");
		int n=scn.nextInt();
		
		System.out.println(100/n);    //ArithmeticException
		*/
		
		/*
		//Example 2
		int a[]=new int[5];
		System.out.println("Enter the position(0-4)..");
		int pos=scn.nextInt();
		
		System.out.println("Enter the value: ");
		int val=scn.nextInt();
		
		a[pos]=val;    //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		*/
		
		//Example 3
		String s="welcome";
		System.out.println(Integer.parseInt(s));
		
		
		
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

		
	}

}
