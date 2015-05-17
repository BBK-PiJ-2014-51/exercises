package Exercise5;
public class HashUtilities{
	
	
	public static int shortHash(int num){
		num = Math.abs(num);
		while (num <= 1000){
			num *= 17;
		}
		while (num > 1000){
			num %= 997;
		}
		return num;
	}
}