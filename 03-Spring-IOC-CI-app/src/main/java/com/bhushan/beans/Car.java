package com.bhushan.beans;

public class Car {
	private Iengine eng;
	public Car(Iengine eng)
	{
		this.eng=eng;
		System.out.println("Car Constructor called....!");
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
