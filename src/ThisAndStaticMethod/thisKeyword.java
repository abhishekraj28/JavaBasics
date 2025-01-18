package ThisAndStaticMethod;

public class thisKeyword {

	int x,y;
	
	thisKeyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		thisKeyword th=new thisKeyword(100,200);
		th.display();
		

	}

}
