package org.abstractt;

public class Details extends BankDetails{
	public void accountNumber() {
		System.out.println("987654");
	}

	@Override
	public void amountDeposited() {
		System.out.println("Rs.123456");
		
		
	}
	public static void main(String[] args) {
		Details k = new Details();
		k.name();
		k.accountNumber();
		k.amountDeposited();
		k.branch();
	}

}
