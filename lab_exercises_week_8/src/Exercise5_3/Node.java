package Exercise5_3;
public class Node{
	private int key;
	private String name;
	private Node next;
	
	public Node(int key, String name){
		this.key = key;
		this.name = name;
		next = null;
	}
	
	public int getKey(){
		return key;
	}
	
	public void setKey(int key){
		this.key = key;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node node){
		next = node;
	}
}