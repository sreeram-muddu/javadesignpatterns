package org.sreeram.basics;

public class Giraffe extends Creature {

	@Override
	public void setName(String name) {
this.name=name;		
	}

	@Override
	public void setWeight(Double weight) {
this.weight=weight;		
	}

	@Override
	public void setSound(String sound) {
		// TODO Auto-generated method stub
		
		this.sound = sound;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return sound;
	}

}
