package Polymorphism;

public class adder {

	
	int a=11,b=21;
	
	void sum() {
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
	void sum(double x, int y) {
		System.out.println(x+y);
	}
}
