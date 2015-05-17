package exercise4;

public class PersonPriorityGroupQueueImpl implements PersonQueue {
	private Person[] pq = new Person[10];
	private int size = 0;
	private final static int OLD_AGE = 65;
	private final static int YOUNG_AGE = 18;
	private final static int MIN_AGE = -1;
	@Override
	public void insert(Person person) {
		if (size == pq.length) expandArray();
		pq[size++]= person;
	}

	@Override
	public Person retrieve() {
		if (hasPersonOverAge(OLD_AGE)) return getNextPersonOverAge(OLD_AGE);
		else if (hasPersonOverAge(YOUNG_AGE)) return getNextPersonOverAge(YOUNG_AGE);
		else if (hasPersonOverAge(MIN_AGE)) return getNextPersonOverAge(MIN_AGE);
		else return null;
	}
	
	private void expandArray() {
		Person[] newPq = new Person[pq.length * 2];
		for (int i = 0; i < pq.length; i++){
			newPq[i] = pq[i];
		}
		pq = newPq;
	}
	
	private boolean hasPersonOverAge(int age){
		boolean hasAge = false;
		for (int i = 0; i < size; i++){
			if (pq[i].getAge() > age) hasAge = true;
		}
		return hasAge;
	}
	
	private Person getNextPersonOverAge(int age){
		Person firstPersonOfAge = null;
		int firstPersonOfAgeIndex = -1;
		for (int i = size - 1; i >= 0; i--){
			if (pq[i].getAge() > age){
				firstPersonOfAge = pq[i];
				firstPersonOfAgeIndex = i;
			}
		}
		
		size--;
		for (int i = firstPersonOfAgeIndex; i < size; i++){
			pq[i] = pq[i + 1];
		}
		return firstPersonOfAge;
	}

}
