package Inheritance;


class animal{
	
	String name() {
		return "dog";
	}
	
	void name(String name) {
		System.out.println(name);
	}
}

class lion extends animal{
	
	
	String name() {
		return "child Name";
	}
	
	void name(String name, int size) {
		System.out.println(name);
	}
}

class deer extends animal{
	String name() {
		return "deer";
	}
	
	void name(String name) {
		System.out.println(name);
	}
}


public class selfPactice {

	public static void main(String[] args) {
	
		deer d=new deer();
		lion l=new lion();
		animal a=new animal();
		
		a.name("mon");
		System.out.println(d.name());
		System.out.println(l.name());
		System.out.println(a.name());
	}

}
