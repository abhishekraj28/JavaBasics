package OOPSMethodConstructor;

public class GreetingsMain {

	public static void main(String[] args) {
		
		greetings gr=new greetings();

		
		gr.m1();
		
		String s=gr.m2();
		System.out.println(s);
		
		gr.m3("m3");
		
		String s1=gr.m4("m4");
		System.out.println(s1);
	}

}
