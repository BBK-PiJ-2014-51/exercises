package exercise5;

public class IntegerNode {
	private Integer value;
	private int count;
	
	public IntegerNode(Integer value){
		this.value = value;
		this.count = 1;
	}
	public Integer getValue(){
		return value;
	}
	
	public void setValue(Integer value){
		this.value = value;
	}
	
	public int getCount(){
		return count;
	}
	
	public void incrementCount(){
		count++;
	}
}
