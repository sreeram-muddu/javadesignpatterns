package org.sreeram.basics;

public abstract class Creature {
	
	/*
	 * 
	 * Abstract class doesnt allow to create objects for it
	 * 
	 * sub classes which extend the super class must  implement the abstract methods
	 * 
	 * we can have non abstract methods in the abstract class
	 * 
	 * abstract classes can have static methods 
	 * 
	 */
	
	protected String name;
	protected Double weight;
	protected String sound;
	
	public abstract void setName(String name);
	public abstract void setWeight(Double weight);
	public abstract void setSound(String sound);
	
	public abstract String getName();
	public abstract Double getWeight();
	public abstract String getSound();

}
