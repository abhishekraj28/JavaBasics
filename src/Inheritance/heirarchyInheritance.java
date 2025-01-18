package Inheritance;


class parent{
	
	void display(int a) {
		System.out.println(a);
	}
}


class child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}

class child2 extends parent{
	void print(int c) {
		System.out.println(c);
	}
}


public class heirarchyInheritance {

	public static void main(String[] args) {
		
		
		child1 ch1=new child1();
		ch1.show(100);
		ch1.show(200);
		
		child2 ch2=new child2();
		ch2.display(300);
		ch2.print(400);
	}

}
