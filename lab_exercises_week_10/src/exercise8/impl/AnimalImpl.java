package exercise8.impl;
import exercise8.spec.Animal;

public abstract class AnimalImpl implements Animal{
	protected String name;
	public AnimalImpl(String name){
		this.name = name;
	}
	
}