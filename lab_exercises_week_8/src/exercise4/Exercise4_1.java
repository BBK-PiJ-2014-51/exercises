package exercise4;
public class Exercise4_1{
	public static void main(String[] args) {
		Supermarket store = new Supermarket();
		store.setPriorityByAge();
		store.addPerson(new Person("John", 100));
		store.addPerson(new Person("Tom", 22));
		store.addPerson(new Person("Beth", 15));
		store.addPerson(new Person("Kate", 45));
		store.addPerson(new Person("John", 65));
		store.addPerson(new Person("Tom", 3));
		store.addPerson(new Person("Beth", 77));
		store.addPerson(new Person("Kate", 18));
		store.addPerson(new Person("John", 24));
		store.addPerson(new Person("Tom", 6));
		store.addPerson(new Person("Beth", 111));
		store.addPerson(new Person("Kate", 33));
		for (int i = 0; i < 12; i++){
			store.servePerson();
		}
	}
}