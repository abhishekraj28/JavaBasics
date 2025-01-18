package OOPSMethodConstructor;

public class constructorDemo {

	
	int x,y;
	
	//Default Constructor
	constructorDemo(){
		
		x=100;
		y=200;
	}
	
	
	//Parametrized Constructor
	constructorDemo(int a, int b){
		x=a;
		y=b;
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		//Invoke Default Constructor
		
		constructorDemo cd=new constructorDemo();
		cd.sum();
		
		
		//Invoke parametrized Constructor
		
		constructorDemo cd1=new constructorDemo(10,20);
		cd1.sum();

	}

}
