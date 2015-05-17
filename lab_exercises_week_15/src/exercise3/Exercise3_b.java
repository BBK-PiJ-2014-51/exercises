package exercise3;

import java.util.Scanner;

public class Exercise3_b {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Exercise3_b ex = new Exercise3_b();
		System.out.println("Enter number of items:");
		int numItems = ex.getNum();
		int currentIndex = 0;
		int[] items = new int[numItems];
		System.out.println("Enter the items:");
		while (currentIndex < numItems){
			items[currentIndex++] = ex.getNum(); 			
		}
		System.out.println("Finished. " + items.toString());
	}

	private int getNum() {
		System.out.println("Please enter a number: ");
		try {
			 String input = scanner.nextLine();
			 int nextInt = Integer.parseInt(input);
			 return nextInt;
		 } catch (NumberFormatException ex){
			 System.out.println("Error! Number format exception!");
			 return getNum();
		 }
	}
}
