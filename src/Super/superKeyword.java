package Super;


public class superKeyword {

	String color="white";	

	void eat() {
		System.out.println("Eating...");
	}
}


class dog extends superKeyword{
	
	String color="black";
	
	//it will display child class value
	void display() {
		System.out.println(color);
	}
	
	//it will display parent class value
	void display1() {
		System.out.println(super.color);
	}
	
	void eat() {
		
		//this will display child class value
		System.out.println("Eating bread...");
		
		//this will display parent class value
		super.eat();
	}
}