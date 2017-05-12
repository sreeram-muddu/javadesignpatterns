package org.sreeram.basics;

public class WorkWithAnimals {
/*
 * 
 * 
 * parent class type can refer to the child class object
 * 
 * This gives the power of polymorphism 
 * 
 * by using parent class type we can call the methods i.e. Animal animal = new Dog()
 * 
 * we can invoke the methods using parent type i.e. animal.getSound(); //would return bark
 * 
 * but we cannot call the methods new methods that are in child class but not in the parent class. 
 * 
 */
	public static void main(String[] args) {

//		Dog fido = new Dog();	
//		
//		fido.setName("Fido");
//		
//		fido.digHole();
//		
//		fido.setWeight(20.0);
//		
//		System.out.println("The Dog with the name "+fido.getName()+" and weight "+fido.getWeight());
//		
//		
//		Animal animal = new Dog();
//		
//		System.out.println("THe dog sound is "+animal.getSound());
//		
//		System.out.println("THe dog name is "+animal.getName());
//		
		//System.out.println("THe dog name is "+animal.);

		
		Creature giraffe = new Giraffe();
		
		giraffe.setName("muddu giraffe");
		
		System.out.println("The giraffe name is "+giraffe.getName());
		
		
		
	}

}
