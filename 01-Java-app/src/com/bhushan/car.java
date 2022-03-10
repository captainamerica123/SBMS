package com.bhushan;

public class car {

	private Iengine eng;
	/*public car(Iengine eng)
	{
		this.eng=eng;
	}*/
	public void setcar(Iengine eng)
	{
		this.eng=eng;
	}
	public void drive() {
		
		int status=eng.start();
		if(status==0)
		{
			System.out.println("Jurney started....!");
		}
	}
}
