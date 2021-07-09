package org.login;

public class Bank  {

	public void bankId() {
		System.out.println("bank id is 876789");
	}
public void bankName() {
	System.out.println("bank name is cub");
}	
	public void bankAddress() {
		System.out.println("bank address is omr");
	}
	public static void main(String[] args) {
		
		Bank a = new Bank();
		a.bankId();
		a.bankName();
		a.bankAddress();
	}
	
}
