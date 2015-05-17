public class ListIntSortedList implements IntSortedList{
	private int value;
	ListIntSortedList next;
	
	public ListIntSortedList(int num){
		this.value = num;
		next = null;
	}
	
	@Override
	public boolean add(int num) {
		if (next == null){
			next = new ListIntSortedList(num);
			return true;
		} else if (next.getValue() > num){
			ListIntSortedList list = new ListIntSortedList(num);
			list.setNext(next);
			next = list;
			return true;
		} else {
			next.add(num);
		}
		return false;
	}
	
	@Override
	public boolean contains(int num) {
		if (value == num){
			return true;
		} else if (next != null){
			next.contains(num);
		} 
		return false;	
	}
	
	public String toString(){
		return (next == null) ? "" + value : value + ", " + next.toString();
	}
	
	private int getValue(){
		return value;
	}
	
	private void setNext(ListIntSortedList next){
		this.next = next;
	}
}