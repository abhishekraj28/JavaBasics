package Encapsulation;

public class accountMain {

	public static void main(String[] args) {
		
		account ac=new account();
		ac.setAccNo(101);
		ac.setAmount(10000.0);
		ac.setName("John");
		System.out.println(ac.getAccNo());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());
		
	}

}
