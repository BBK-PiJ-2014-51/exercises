

public class IntegerTreeNode{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	IntegerTreeNode(int newNumber){
		value = newNumber;
		left = null;
		right = null;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public String toString(){
		String result = "" + value;  
		if (left != null) result +=" L[" + left.toString() + "]";
		else result +=" L[]";
		if (right!=null) result += " R[" + right.toString() + "]"; 
		else result += "R[]";
		//result += "]";
		return result;
	}
	
	public String toStringSimple(){
		String result = "" + value;  
		if (left != null) result +=" [" + left.toStringSimple() + "]";
		//else result +=" L[] ";
		if (right!=null) result += " [" + right.toStringSimple() + "]"; 
		//else result += "R[] ";
		//result += "]";
		return result;
	}
	
	public int depth(){
		if (left == null && right == null){
			return 0;
		} 
		int leftHeight = 0;
		int rightHeight = 0;
		if (left != null)leftHeight = left.depth();
		if (right != null)rightHeight = right.depth();
		return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
		
	}
	public int getMin(){
		return (left == null) ? value : left.getMin() ;
	}
	
	public int getMax(){
		return (right == null) ? value : right.getMax() ;
	}
	
	public boolean remove(int value){
		
		return false;
	}

}