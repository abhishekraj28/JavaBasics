package Polymorphism;

public class box {

	
	double width, height, depth;
	
	box(){
		width=height=depth=0;
	}
	
	box(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	
	box(double len){
		width=height=depth=len;
	}
	
	double volume() {
		
		return (width*height*depth);
	}
	
}
