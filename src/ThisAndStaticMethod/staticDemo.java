package ThisAndStaticMethod;

public class staticDemo {

	//Static variable
	static int a=10;
	
	//Non-static variable
	int b=20;
	
	
	static void m1() {
		System.out.println("This is a static method");
	}
	
	void m2() {
		System.out.println("This is a non-static method");
	}
	
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		//1. Static method can access stuff directly
		System.out.println(a);
		m1();
		
		/*Non-static can not access stuff directly
		System.out.println(b);
		m2();
		*/
		
		//2. Static method can access non-static stuff through object
		
		staticDemo sd = new staticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		//3. Non-static method can access thing directly
		sd.m();
	}

}
