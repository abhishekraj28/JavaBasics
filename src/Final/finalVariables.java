package Final;



class test{
	
	final int x=100;
}
public class finalVariables {

	public static void main(String[] args) {


		test t=new test();
		
		//incorrect because x is a final 
		//t.x=200;
		System.out.println(t.x);
	}

}
