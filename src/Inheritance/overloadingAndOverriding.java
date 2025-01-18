package Inheritance;


class abc{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
	
}



class xyz extends abc{
	
	//overriding
	void m1(int a) {
		System.out.println(a*a);
	}
	

	//overrided
	void m2(int b) {
		System.out.println(b*b);
	}
	
	//overloading
	void m2(int a, int b) {
		System.out.println(a+b);
	}
}




public class overloadingAndOverriding {

	public static void main(String[] args) {
		
		xyz z=new xyz();
		z.m1(100);
		z.m2(200);
		z.m2(500);
		z.m2(300, 400);

	}

}
