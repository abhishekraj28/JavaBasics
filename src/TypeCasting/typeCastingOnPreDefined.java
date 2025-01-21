package TypeCasting;

public class typeCastingOnPreDefined {

	public static void main(String[] args) {
		
		/*
		 * Ex1:
        Object o=new String("welcome");
        StringBuffer s=(StringBuffer) o;   Rule 1 is pass, Rule 2 is pass, Rule 3 failed
        */
        
		/*
		 * Ex2:
        String o1=new String("welcome");
        StringBuffer s1=(StringBuffer) o1; Rule 1 failed
        */
        
        
		/*
		 * Ex3:
        Object o2=new String("welcome");
        StringBuffer s2=(String) o2;       Rule 1 pass, Rule 2 failed
        */
        
        
		/*
		 * Ex4:
        String o3=new String("welcome");
        StringBuffer s3=(String) o3;       Rule 1 pass, Rule 2 failed
        */

		
		//Ex5:
		//All rule passed
		Object o4=new String("welcome");
		String s4=(String)o4;
		System.out.println(s4);
		
	}

}
