package exercise8.spec;

import exercise8.impl.AnimalImpl;

public abstract class FlyingAnimal extends AnimalImpl{

	public FlyingAnimal(String name) {
		super(name);
	}
	
	public void call(){
		System.out.println(name + " will come when tired.");
	}
	
}