package exercise8.impl;

import exercise8.spec.LandAnimal;
import exercise8.spec.LiveBirthing;

public class BearImpl extends LandAnimal implements LiveBirthing{

	public BearImpl() {
		super("Bear");
	}

	@Override
	public void reproduce() {
		this.giveBirth();
	}

	@Override
	public void makeSound() {
		System.out.println("I'm a bear, rarrr!");
	}

	@Override
	public void giveBirth() {
		System.out.println("The " + name + " gives live birth.");
	}
	
}