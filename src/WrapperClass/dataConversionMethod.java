package WrapperClass;

public class dataConversionMethod {

	public static void main(String[] args) {
		
		//String---> Int
		
		/* It cannot be converted to string because the string is not in the form of numbers
		String s="Welcome";
		int n=Integer.parseInt(s);
		System.out.println(n);
		*/
		
		String s1="10";
		String s2="20";
		//It will print the concatenation format value
		System.out.println(s1+s2);

		
		//To perform the arithmetic expression
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		
		//String---> Double
		String d1="10.5";
		String d2="20";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		
		//String---> Boolean
		String b1="True"; //if we pass value other than true it will always return false
		System.out.println(Boolean.parseBoolean(b1));
		
		//String---> character-> Not Possible
		
		
		// Int, Double,boolean, char---> String
		int a=10;
		double d=10.5;
		boolean b=false;
		char c='a';
		
		String s=String.valueOf(b);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(a);
		System.out.println(s);
		
	}

}
