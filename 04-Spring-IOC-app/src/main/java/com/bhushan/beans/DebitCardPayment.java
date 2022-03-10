package com.bhushan.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment()
	{
		System.out.println("DebitCardPayment::Constructor");
	}

	public boolean PayBill(double amt)
	{
		System.out.println("Debit card Payment...!");
		return true;
	}
}
