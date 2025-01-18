package Encapsulation;

public class overLoadMainMethod {

	void main(int x) {
		System.out.println(x);
	}
	
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String s1, String s2) {
		System.out.println(s1+" "+s2);
	}
	
	
	
	public static void main(String[] args) {
		
		
		overLoadMainMethod ovl = new overLoadMainMethod();
		
		ovl.main(2);
		ovl.main("John");
		ovl.main("vick", "david");
	}

}
