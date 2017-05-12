package org.sreeram.strategy;

public class AppPlay {

	
	public static void main(String args[])
	{
		
		Animal animal = new Dog();
		animal.tryFly();
		animal = new Bird();
		animal.tryFly();
	}
}
