package exercise4;

public class Patient {
	private int age = -1;
	private String name = null;
	private Patient next = null;
	
	
	public Patient(int age, String name) throws IllegalArgumentException{
		if (age < 0 || age > 130){
			throw new IllegalArgumentException();
		}
		this.age = age;
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Patient getNext(){
		return next;
	}
	
	public void setNext(Patient patient){
		next = patient;
	}
}
