package Exercise1;
public class Exercise1{
	public static void main(String[] args) {
		Supermarket store = new Supermarket();
		store.addPerson(new Person("John"));
		store.addPerson(new Person("Tom"));
		store.addPerson(new Person("Beth"));
		store.addPerson(new Person("Kate"));
		store.servePerson();
		store.servePerson();
		store.servePerson();
		store.servePerson();
	}
}