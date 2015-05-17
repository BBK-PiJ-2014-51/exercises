package Exercise3;

public class Person{
	String name;
	int age;
	Person nextPerson;
	
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
	public void printName() {
		System.out.println("My name is: " + this.name);	
	}
	public String getName() {
		return name;
	}
	
	public Person getNextPerson(){
		return nextPerson;
	}
	
	public void setNextPerson(Person next){
		nextPerson = next;
	}
}