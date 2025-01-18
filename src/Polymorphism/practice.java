package Polymorphism;

public class practice {

	 void animal() {
		
		 System.out.println("animal 1");
	}
	 
	 void animal(String a) {
		 System.out.println(a);
	 }

}

class dog extends practice{
	
	//overriding
	void animal() {
		
		 System.out.println("dog 1");
	}

	
	//overloading
	 void animal(String a) {
		 System.out.println(a+a);
	 }

}