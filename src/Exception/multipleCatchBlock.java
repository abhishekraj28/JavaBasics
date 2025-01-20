package Exception;

import java.util.Scanner;

public class multipleCatchBlock {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Program is started...0");
		//System.out.println("Enter the String: ");
		String s=null;
		
		
		try {
			
		System.out.println(s.length());
		}
		/*
		catch(ArithmeticException e) {
			System.out.println("Handled Exception//");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Handled Exception//");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Handled Exception//");
			System.out.println(e.getMessage());
		}
		*/
		catch(Exception e) {
				System.out.println("Handled Exception//");
				System.out.println(e.getMessage());
			
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");


	}

}
