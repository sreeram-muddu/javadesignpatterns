package org.sreeram.basics;

public class WorkWithAnimals {

	public static void main(String[] args) {

		Dog fido = new Dog();	
		
		fido.setName("Fido");
		
		fido.digHole();
		
		fido.setWeight(20.0);
		
		System.out.println("The Dog with the name "+fido.getName()+" and weight "+fido.getWeight());
		
		
	}

}
