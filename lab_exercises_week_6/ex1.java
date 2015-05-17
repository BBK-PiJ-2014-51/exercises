//1 Dividing integers
//Create a Java class called Calculator. The class should implement the following methods, each of them printing
//the result on the screen.
//• add(int, int)
//• subtract(int, int)
//• multiply(int, int)
//• divide(int, int)
//• modulus(int, int)
//Note that you will will need to cast the parameters into double to perform exact division

public class ex1 {

	public static void main(String[] args) {
		ex1.testFunctions();
	}
	
	private static void testFunctions(){
		System.out.println("1 + 2 = " + String.valueOf(Calculator.add(1,2)));
		System.out.println("4 - 3 = " + String.valueOf(Calculator.subtract(4,3)));
		System.out.println("5 * 6 = " + String.valueOf(Calculator.multiply(5,6)));
		System.out.println("100 / 11 = " + String.valueOf(Calculator.divide(100,11)));
		System.out.println("100 % 12 = " + String.valueOf(Calculator.modulus(100,12)));
	}
	
}
