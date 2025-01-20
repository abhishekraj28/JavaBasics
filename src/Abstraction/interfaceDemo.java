package Abstraction;

interface shape{
	
	//variables are default final and static
	int length=10;
	int width=30;
	
	//Abstract method
	void circle();
	
	default void square() {
		System.out.println("This is square");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle");
	}
}


public class interfaceDemo implements shape {
	
	
	//we have to make it public because be default it is a default method
	public void circle() {
		System.out.println("This is circle");
	}
	
	void triangle() {
		System.out.println("This is a triangle");
	}

	public static void main(String[] args) {
		
		
		//Scenario 1
		interfaceDemo d=new interfaceDemo();
		//we cannot access abstract and default method directly, using object we can access it
		d.circle();
		d.square();
		
		//we can access static method directly
		shape.rectangle();
		d.triangle();
		
		
		//Scenario 2
		shape s=new interfaceDemo();
		//Abstract method
		s.circle();
		//Default method
		s.square();
		//Static method
		shape.rectangle();
		
		//We cannot access triangle methd because it belong to the interfaceDemo method
		//s.triangle();
		
		
		//accessing static variables directly
		System.out.println(length+width);
	}

}
