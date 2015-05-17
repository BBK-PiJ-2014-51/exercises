class ListIntSet implements IntSet{
	int value;
	ListIntSet next;
	
	public ListIntSet(int value){
		this.value = value;
		next = null;
	}
	@Override
	public boolean add(int num) {
		if (value == num) return false;
		if (next == null) {
			next = new ListIntSet(num);
			return true;
		} else {
			next.add(num);
		}
		return false;
	}

	@Override
	public boolean contains(int num) {
		if (value == num) return true;
		else if(next == null) return false;
		else next.contains(num);
		return false;
	}

	@Override
	public boolean containsVerbose(int num) {
		System.out.println("Checking value: " + value + " against: " + num);
		if (value == num) return true;
		else if(next == null) return false;
		else next.contains(num);
		return false;
	}
	
	public String toString(){
		return (next == null) ? "" + value : value + ", " + next.toString();
	}
	
}