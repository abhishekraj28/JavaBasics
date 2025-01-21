package CollectionsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMapDemo {

	public static void main(String[] args) {
		
		
		//Declaration
		HashMap h=new HashMap();

		
		//Adding pair
		h.put(101, "John");
		h.put(102, "Mary");
		h.put(103, 'A');
		h.put(104, "David");
		h.put(102, "John");
		
		
		//Print hashmap
		System.out.println(h);
		
		//size of hashmap
		System.out.println("The size of hashmap is : "+ h.size());
		
		//remove pairs
		//h.remove(102);
		//System.out.println("After removing the hashmap is: "+h);
		
		//access value of key
		//System.out.println(h.get(102));
		
		//get all the keys from hashmap
		//System.out.println(h.keySet());
		
		//get all the values from hashmap
		//System.out.println(h.values());
		
		//return key along with values
		//System.out.println(h.entrySet());
		
		
		//Read data from hashmap
		/*
		//Using for each loop
		for(Object n:h.keySet()) {
			System.out.println(n+"   "+h.get(n));
		}
		*/
		
		//Using iterator
		Iterator <Entry> it=h.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry en=it.next();
			System.out.println(en.getKey()+"   "+en.getValue());
		}
		
		//clear everything from hashmap
		h.clear();
		System.out.println(h.isEmpty());
		
		
		
	}

}
