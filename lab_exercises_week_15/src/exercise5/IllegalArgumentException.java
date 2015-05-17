package exercise5;

public class IllegalArgumentException extends Exception{
	private String defaultMsg = "Error! Illegal Argument! ";
	
	public IllegalArgumentException(){
		System.out.println(defaultMsg);
	}
	
	public IllegalArgumentException(String msg){
		System.out.println( defaultMsg + msg);
	}
}
