package Exercise2;

public class Supermarket{
	private PersonQueue pq = new PersonQueueImpl();
	
	public void addPerson(Person person){
		pq.insert(person);
		System.out.println(person.getName() + " is in the queue.");
	}
	
	public Person servePerson(){
		Person person = pq.retrieve();
		System.out.println("Serving " + person.getName());
		return person;
	}
	
}