package Polymorphism;

public class boxMain {

	public static void main(String[] args) {
	
		box b=new box();
		System.out.println(b.volume());
		
		box b1=new box(20.0, 30.0, 40.0);
		System.out.println(b1.volume());

		box b2=new box(10.0, 20.0, 30.0);
		System.out.println(b2.volume());
		
	}
	

}
