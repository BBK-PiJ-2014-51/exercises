package exercise4;

public class PersonPriorityQueueImpl implements PersonQueue {
	private Person[] pq = new Person[10];
	private int size = 0;
	
	@Override
	public void insert(Person person) {
		if (size == pq.length) expandArray();
		pq[size++]= person;
	}

	@Override
	public Person retrieve() {
		Person oldestPerson = null;
		int oldestPersonIndex = -1;
		
		for (int i = 0; i < size; i++){
			if (oldestPerson == null){
				oldestPerson = pq[i];
				oldestPersonIndex = i;
			}
			else if (pq[i].getAge() > oldestPerson.getAge()) {
				 oldestPerson = pq[i];
				 oldestPersonIndex = i;
			}
		}
		
		size--;
		for (int i = oldestPersonIndex; i < size; i++){
			pq[i] = pq[i + 1];
		}
		
		return oldestPerson;
	}
	
	private void expandArray() {
		Person[] newPq = new Person[pq.length * 2];
		for (int i = 0; i < pq.length; i++){
			newPq[i] = pq[i];
		}
		pq = newPq;
	}

}
