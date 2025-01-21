package CollectionsInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {
		
		
		//Declartion
		HashSet mySet=new HashSet();
		
		
		//Adding element
		mySet.add(100);
		mySet.add(100.5);
		mySet.add("Welcome");
		mySet.add('A');
		mySet.add(false);
		mySet.add(null);
		mySet.add(100);
		mySet.add(null);
		
		//Printing hashset
		System.out.println(mySet);
		
		
		//size if hashset
		System.out.println(mySet.size());
		
		
		//Removing element
		mySet.remove(100.5);
		
		//Inserting element is not possible
		//Access specific element  is not possible
		
		//convert hashset to arraylist
		ArrayList al=new ArrayList(mySet);
		System.out.println(al.get(2));
		
		//Reading all element
		//Using normal for loop we can achieve it
		
		//Using for each loop we can read the data
		for(Object x:mySet) {
			System.out.println(x);
			
		}
		
		
		//Using iterator
		Iterator it=mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//Clearing all the element in the hashset
		mySet.clear();
		System.out.println(mySet.isEmpty());
		
		
		
		
		
	}

}
