package org.sreeram.basics;

public class Dog  extends Animal{
	
	public Dog(){
		super();
		setSound("Bark");
	}
	
	public void digHole(){
		System.out.println("Dug a hole");
	}

	@Override
	public String getName(){
		return "muddu";
	}
}
