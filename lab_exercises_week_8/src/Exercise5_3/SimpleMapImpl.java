package Exercise5_3;
public class SimpleMapImpl implements SimpleMap{
	Node[] buckets = new Node[10];
	int numBuckets = 0;
	
	@Override
	public String put(int key, String name) {
		boolean bucketFound = false;
		for(int i = 0; i < numBuckets; i++){
			if (buckets[i].getKey() == key){
				bucketFound = true;
				Node currentNode = buckets[i];
				while (currentNode.getNext() != null){
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(new Node(key,name));
			}
		}
		if (!bucketFound){
			if (numBuckets == buckets.length) expandArray();
			buckets[numBuckets++] = new Node(key, name);
		}
		return name;
	}

	@Override
	public String[] get(int key) {
		String[] bucketList = null;
		for (int i = 0; i < numBuckets; i++){
			if(buckets[i].getKey() == key){
				int listCount = 1;
				Node currentNode = buckets[i];
				while (currentNode.getNext() != null){
					listCount++;
					currentNode = currentNode.getNext();
				}
				bucketList = new String[listCount];
				currentNode = buckets[i];
				int currentIndex = 0;
				while (currentNode != null){
					bucketList[currentIndex++] = currentNode.getName();
					currentNode = currentNode.getNext();
				}
			}
		}
		return bucketList;
	}

	@Override
	public void remove(int key, String name) {
		for (int i = 0; i < numBuckets; i++){
			if (buckets[i].getKey() == key){
				Node newList = null;
				Node currentNode = buckets[i];
				while (currentNode != null){
					if (!currentNode.getName().equals(name)){
						if(newList == null){
							newList = new Node(currentNode.getKey(), currentNode.getName());
						} else {
							Node lastNode = newList;
							while(lastNode.getNext() != null){
								lastNode = lastNode.getNext();
							}
							lastNode.setNext(new Node(currentNode.getKey(), currentNode.getName()));
						}
					}
					currentNode = currentNode.getNext();
				}
				buckets[i] = newList;
				break;
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return (numBuckets == 0);
	}
	
	private void expandArray() {
		Node[] newNodeArray = new Node[buckets.length * 2];
		for (int i = 0; i < buckets.length; i++){
			newNodeArray[i] = buckets[i];
		}
		buckets = newNodeArray;
	}
}