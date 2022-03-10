package com.bhushan.beans;

public class Payment {

	IPayment pay;
	public Payment(IPayment pay)
	{
		this.pay=pay;
		System.out.println("Payment::Constructor");
	}
	public void PaymentMethod(double amt)
	{
		boolean status=pay.PayBill(amt);
		if(status)
		{
			System.out.println("Payment Recipt Print...!");
		}
	}
}
