package com.bhushan.beans;

public class ApexCardPayment implements IPayment{
	public ApexCardPayment()
	{
		System.out.println("ApexCardPayment::Constructor");
	}

	public boolean PayBill(double amt)
	{
		System.out.println("Apex card Payment...!");
		return true;
	}
}
