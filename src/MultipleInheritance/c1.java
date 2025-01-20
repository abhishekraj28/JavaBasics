package MultipleInheritance;

public class c1 extends c2 implements i1,i2 {
	
	public void m1() {
		System.out.println(x);
	}

	public void m2() {
		System.out.println(y);
	}
	public static void main(String[] args) {
		
		c1 c=new c1();
		c.m1();
		c.m2();
		c.m3();

	}

}
