package org.sreeram.strategy;

public class Dog extends Animal {
	
	
	public Dog(){
		setFlyingType(new CantFly());
	}

}
