package org.sreeram.strategy;

public class Animal {

	protected String name;
	protected String sound;
	protected Double height;
	
	protected Flys flyingType;
	
	public void tryFly(){
		flyingType.fly();
	}
	

	public void setFlyingType(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	
	
	
}
