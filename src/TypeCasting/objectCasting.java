package TypeCasting;


class parent{
	String name="john";
	
	void m1() {
		System.out.println("This is from parent..");
	}
}

class child extends parent{
	int id=101;
	
	void m2() {
		System.out.println("This is from child class...");
	}
}
public class objectCasting {

	public static void main(String[] args) {
		
		
		child c= new child();
		//From parent class
		System.out.println(c.name);
		c.m1();
		
		//From child class
		System.out.println(c.id);
		c.m2();
		
		
		//UpCasting
		parent p=new child();
		
		//from parent class
		System.out.println(p.name);
		p.m1();
		
		/*from child class
		System.out.println(p.id);
		p.m2();
		*/

		
		//Downcasting
		parent p1=new parent();
		child c1=(child)p;
		System.out.println(c1.name);
		System.out.println(c1.id);
		c1.m1();
		c1.m2();
		
		
	}

}
