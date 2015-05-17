
public class Calculator {
	
	public static int add(int a, int b){		
		return a + b;
	}
	
	public static int subtract(int a, int b){		
		return a-b;
	}

	public static int multiply(int a, int b){	
		return a*b;
	}

	public static int divide(int a, int b){
		double answer = (double) a / (double) b;
		return (int) answer;
	}

	public static int modulus(int a, int b){	
	return a % b;
	}
}
