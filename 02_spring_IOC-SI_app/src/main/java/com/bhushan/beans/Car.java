package com.bhushan.beans;

public class Car {
	private Iengine eng;
	public Car() {
		System.out.println("Car Constructor ");
	}
	public void setEng(Iengine eng)
	{
		this.eng=eng;
		System.out.println("Setter method ");
	}
	public void drive()
	{
		int status=eng.start();
		if(status==0)
		{
			System.out.println("Jurney started...!");
		}
	}

}
