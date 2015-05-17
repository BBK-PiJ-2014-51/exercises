package exercise1;
public class Comparator {
	public int getMax(int n, int m) {
		return (int) getMax(Integer.valueOf(n), Integer.valueOf(m));
	}
		
	public double getMax(double d1, double d2) {
		return (double) getMax(Double.valueOf(d1),Double.valueOf(d2));
	}
		
	public String getMax(String number1, String number2) {	
		return String.valueOf(this.getMax(Integer.parseInt(number1), Integer.parseInt(number2)));
	}
	
	public <T extends Number> T getMax(T num1, T num2){
		return(num1.doubleValue() > num2.doubleValue()) ? num1 : num2;
	}
}
