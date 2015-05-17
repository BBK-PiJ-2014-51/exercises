package exercise8.spec;

import exercise8.impl.AnimalImpl;

public abstract class LandAnimal extends AnimalImpl{

	public LandAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + "coming...");
	}
}