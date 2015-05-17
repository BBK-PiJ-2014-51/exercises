package exercise4;
public class Person{
	private String name;
	private int age;
	private Person nextPerson;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		this.nextPerson = null;
	}
	
	public Person(String name){
		this.name = name;
		this.age = -1;
		this.nextPerson = null;
	}
	
	public void printName(){
		System.out.println("My name is: " + this.name + ", my age is " + this.age);	
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public Person getNextPerson(){
		return nextPerson;
	}
	
	public void setNextPerson(Person next){
		nextPerson = next;
	}
}