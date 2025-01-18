package Inheritance;

class A{
	int a=10;
	
	void display() {
	System.out.println(a);
	}
}


class B extends A {
	int b=20;
	void show() {
		System.out.println(b);
	}
}


class C extends B{
	int c=30;
	
	void print() {
		System.out.println(c);
	}
}


public class inheritanceTypes {

	public static void main(String[] args) {
		
		/*
		B obj=new B();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.show();
		obj.display();
         */
		
		C obj=new C();
		
		obj.a=100;
		obj.b=200;
		obj.c=300;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.show();
		obj.display();
		obj.print();
		
	}

}
