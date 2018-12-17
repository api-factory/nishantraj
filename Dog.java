package Assignment;

import java.io.IOException;

/**
 * @author IMGADMIN
 *
 */
public class Dog extends Animal{
	
	public void sound(String animalName , String animalSound) throws NullPointerException{
		System.out.println("Animal name " + animalName + " Animal Sound " + animalSound);
	}
	
/*	public void sound(String animalName , String animalSound) throws Exception{
		System.out.println("Animal name " + animalName + " Animal Sound " + animalSound);
	}*/
	
	
	public static void main(String [] args){
		Animal animal = null; //new Dog();
		
		animal.sound("Dog", "Bow");
	}
	
}
