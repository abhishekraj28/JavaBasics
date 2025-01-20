package Exception;

public class finallyBlock {

	public static void main(String[] args) {
		
		/*
		//Case 1: Exception occured , Catch block handled---> finally block executed
		String s=null;
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Catch block handled....");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block executed...");
		}
		*/
		
		
		/*
		//Case 2: Exception occured , Catch block not handled---> finally block executed
		String s1=null;
				
		try {
		System.out.println(s1.length());
		}
		catch(ArithmeticException e) {
		System.out.println("Catch block handled....");
		System.out.println(e.getMessage());
		}
		finally {
		System.out.println("Finally block executed...");
		}
		*/
		
		
		//Case 3: Exception does not occured , Catch block ignored---> finally block executed
		String s2="Welcome";
				
		try {
		System.out.println(s2.length());
		}
		catch(ArithmeticException e) {
		System.out.println("Catch block handled....");
		System.out.println(e.getMessage());
		}
		finally {
		System.out.println("Finally block executed...");
		}
		
	}

}
