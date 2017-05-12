package org.sreeram.strategy;

public class Bird extends Animal {

	
	public Bird(){
		setFlyingType(new ItFlys());
	}
}
