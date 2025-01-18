package Encapsulation;

public class account {

	
	private int accno;
	private String name;
	private double amount;
	
	void setAccNo(int acno) {
		accno=acno;
	}
	
	int getAccNo() {
		return accno;
	}
	
	void setName(String sname) {
		name=sname;
	}
	
	String getName() {
		return name;
	}
	
	void setAmount(double amt) {
		amount=amt;
	}
	
	double getAmount() {
		return amount;
	}
	
	
}
