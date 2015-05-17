package exercise7;
public class Exercise7 extends String{ // cannot extend a final class
	
	public static String printEven(String input){
		String newString = "";
		for (int i = 0; i < input.length(); i += 2){
			newString += input.charAt(i);
		}
		return newString;
	}
}