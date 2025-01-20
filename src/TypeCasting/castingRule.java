package TypeCasting;

// cat c=(cat) dog;
//  A  b   c     d


class animal{}

class dog extends animal{}

class cat extends animal{}


public class castingRule {

	public static void main(String[] args) {
		
		
		//Rule 1: Conversion is valid or not
		//the type of 'd' and 'c' must have some relationship(either parent to child or child to parent)
		
		animal a=new dog();
		cat c=(cat)a;      //valid as per rule no 1
		
		
		/*
	     Inavlid as per rule no 1
		dog d=new dog();
		cat c1=(cat)d;     
		*/

		
		//Rule no 2: Assignment is valid or not
		//'c' must be either same or child of 'A'
		
		animal a1=new dog();
		cat c1=(cat)a1;     //valid as per rule 2
		
		/*
		animal a2=new dog();
		cat c2=(dog)a2;     //invalid as per rule no 2
		*/
		
		
		/*
		//Rule no 3: The underlying object type of 'd' must be either same or child of 'c'
		animal a2=new dog();
		cat c2=(cat)a2;     //invalid as per rule no 3
		*/
		
		
		//Rule 1,2,3
		animal a3=new dog();
		dog d=(dog)a3;       //valid as per all the rules
		
		
	}

}
