package CollectionsInJava;

import java.util.ArrayList;
import java.util.List;

public class arrayListCollection {

	public static void main(String[] args) {
		
		        //Declaration
				ArrayList al=new ArrayList();
				//List l=new ArrayList();
				//ArrayList<Integer> al1=new ArrayList<Integer>();
				
				
				//Adding data into arraylist
				al.add(100);
				al.add(100.5);
				al.add("Welcome");
				al.add('A');
				al.add(null);
				al.add(100);
				al.add(null);
				
				
				//Size of arraylist
				System.out.println("The size of arraylist is : "+ al.size());
				
				
				//Printing data from arraylist
				System.out.println("the data in the arraylist is : "+al);
				
				//Removing from ArrayList
				System.out.println("After removing the arraylist is : "+ al.remove(5));
				
				//Insert element at a particular position
				al.add(2, "java");
				System.out.println("After adding element : "+ al);
				
				//modifying element
				al.set(2, "Python");
				System.out.println(al);
				
				//Access specific element from arraylist
				System.out.println(al.get(4));
				
				//Reading all element from arraylist
				
				//Using for loop
				/*
				for(int i=0; i<al.size(); i++) {
					System.out.println(al.get(i));
				}
				*/
				
				//Using enhanced for loop
				for(Object x : al) {
					System.out.println(al);
				}


	}

}
