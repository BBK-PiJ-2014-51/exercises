package exercise4;

public class Supermarket{
	private PersonQueue pq;
	
	public void addPerson(Person person){
		pq.insert(person);
		System.out.println(person.getName() + " is in the queue.");
	}
	
	public Person servePerson(){
		Person person = pq.retrieve();
		System.out.println("Serving " + person.getName() + ", age: " + person.getAge());
		return person;
	}
	
	public void setPriorityByAge(){
		pq = new PersonPriorityQueueImpl();
	}
	
	public void setPriorityByAgeGroup(){
		pq = new PersonPriorityGroupQueueImpl();
	}
	
}