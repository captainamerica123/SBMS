package com.bhushan.beans;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment()
	{
		System.out.println("CreditCardPayment::Constructor");
	}
	public boolean PayBill(double amt)
	{
		System.out.println("Credit card Payment...!");
		return true;
	}

}
