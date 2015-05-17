class TreeIntSet implements IntSet{
	int value;
	TreeIntSet left;
	TreeIntSet right;
	
	public TreeIntSet(int value){
		this.value = value;
		left = null;
		right = null;
	}
	
	@Override
	public boolean add(int num) {
		if (num == this.value) return false;
		if (num > this.value) {
			if (right == null) {
				right = new TreeIntSet(num);
				return true;
			} else {
				right.add(num);
			}
		} else {
			if (left == null) {
				left = new TreeIntSet(num);
				return true;
			} else {
				left.add(num);
			}
		}
		return false;
	}

	@Override
	public boolean contains(int num) {
		if (num == this.value) {
			return true;
		} else if (num > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(num);
			}
		}
	}

	@Override
	public boolean containsVerbose(int num) {
		System.out.println("Checking current num: " + value + " for match against: " + num);
		if (num == this.value) {
			return true;
		} else if (num > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.containsVerbose(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose(num);
			}
		}
	}
	
	public String toString(){
		String result = value + ", ";  
		if (left != null) result += left.toString();
		else result +="";
		if (right!=null) result += right.toString(); 
		else result += "";
		//result += "]";
		return result;
	}
	
}