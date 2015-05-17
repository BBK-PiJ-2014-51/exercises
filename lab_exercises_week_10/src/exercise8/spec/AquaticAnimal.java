package exercise8.spec;

import exercise8.impl.AnimalImpl;


public abstract class AquaticAnimal extends AnimalImpl{

	public AquaticAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + " will not come.");
	}
	
}