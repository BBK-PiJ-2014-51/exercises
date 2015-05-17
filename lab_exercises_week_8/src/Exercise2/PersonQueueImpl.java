package Exercise2;

public class PersonQueueImpl implements PersonQueue {
	private Person[] pq = new Person[10];
	private int size = 0;
	
	@Override
	public void insert(Person person) {
		if (size == pq.length) expandArray();
		pq[size++]= person;
	}

	@Override
	public Person retrieve() {
		return pq[--size];
	}
	
	private void expandArray() {
		Person[] newPq = new Person[pq.length * 2];
		for (int i = 0; i < pq.length; i++){
			newPq[i] = pq[i];
		}
		pq = newPq;
	}

}
