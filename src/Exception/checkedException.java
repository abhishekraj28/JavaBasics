package Exception;


public class checkedException {

	
	//Here case 2 throws exception handled
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program Started");
		System.out.println("Program is in progress");
		
		//FileInputStream file=new FileInputStream("c:\\text.txt");
		
		/*
		//Case 1: Using Try Catch block
		try {
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		
		//Case 1: Using throwsexception
		Thread.sleep(5000);

		System.out.println("Program Finished");
		System.out.println("Program Exited");
	}

}
