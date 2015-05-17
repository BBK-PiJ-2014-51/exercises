package exercise6;
public class Exercise6{
	public static void main(String[] args){
		Lecturer john = new Lecturer("John");
		john.doResearch("whatever");
		System.out.println("I'm a lecturer and my name is: " + john.getName());
	}
}