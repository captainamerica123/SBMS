package com.bhushan.beans;

public class Petrolengine implements Iengine {
	
	public Petrolengine()
	{
		System.out.println("Petrol engine Constructor");
	}

	public int start()
	{
			System.out.println("Petrol engine starting...!");
			return 0;
	}

}
