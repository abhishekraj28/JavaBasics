package Inheritance;


class bank{
	
   double roi() {
	   return 0;
   }
}

class icici extends bank{
	double roi() {
		return 10.5;
	}
}


class sbi extends bank{
	double roi() {
		return 11.5;
	}
}



public class methodOverriding {

	public static void main(String[] args) {


		icici ic=new icici();
		System.out.println(ic.roi());
		
		sbi sb=new sbi();
		System.out.println(sb.roi());
	}

}
