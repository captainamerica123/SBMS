package com.bhushan.beans;

public class Dieselengine implements Iengine{

	public Dieselengine()
	{
		System.out.println("Diesel engine Constructor called....!");
	}
	public int start()
	{
		System.out.println("Diasel engine started...!");
		return 0;
	}
}
