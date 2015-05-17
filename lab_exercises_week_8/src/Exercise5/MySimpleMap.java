package Exercise5;
class MySimpleMap implements SimpleMap{
	String[] values = new String[10];
	int[] keys = new int[10];
	int size = 10;
	int count = 0;
	
	@Override
	public void put(int key, String name) {
		if (get(key) != null) return;
		if (count == size) growArray();
		keys[count] = key;
		values[count] = name;
		count++;
	}
	
	@Override
	public String get(int key) {
		for (int i = 0; i < count; i++){
			if (keys[i] == key) return values[i]; 
		}
		return null;
	}
	
	@Override
	public void remove(int key) {
		for (int i = 0; i < size; i++){
			if (keys[i] == key) { //move last key to current position. decrease count by 1
				keys[count - 1] = keys[i];
				values[count -1] = values[i];
				count--;
			}
		}
	}
	
	@Override
	public boolean isEmpty() {
		return (count == 0);
	}
	
	private void growArray(){
		int[] newKeys = new int[size *2];
		String[] newValues = new String[size *2];
		for (int i = 0; i < size; i++){
			newKeys[i] = keys[i];
			newValues[i] = values[i];
		}
		keys = newKeys;
		values = newValues;
		size *= 2;
	}
	
	
	
}