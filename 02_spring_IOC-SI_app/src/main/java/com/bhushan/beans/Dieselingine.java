package com.bhushan.beans;

public class Dieselingine implements Iengine {
	
	public Dieselingine()
	{
		System.out.println("Diesel engine Constructor");
	}

	public int start()
	{
			System.out.println("Diesel engine starting...!");
			return 0;
	}

}
