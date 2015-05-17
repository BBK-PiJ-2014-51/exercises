public class TreeIntSortedList implements IntSortedList{
	int value;
	TreeIntSortedList left;
	TreeIntSortedList right;
	
	public TreeIntSortedList(int num){
		value = num;
		left = null;
		right = null;
	}
	
	public boolean add(int num) {
		if (num == this.value) return false;
		if (num > this.value) {
			if (right == null) {
				right = new TreeIntSortedList(num);
				return true;
			} else {
				right.add(num);
			}
		} else {
			if (left == null) {
				left = new TreeIntSortedList(num);
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