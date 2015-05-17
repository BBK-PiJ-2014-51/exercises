package exercise3;

import java.util.Scanner;

public class Exercise3_a {
	public static void main(String[] args) {
		int numItems = 10;
		int currentIndex = 0;
		int[] items = new int[numItems];
		Scanner scanner = new Scanner(System.in);
		while (currentIndex < numItems){
			try {
				 String input = scanner.nextLine();
				 int nextInt = Integer.parseInt(input);
				 items[currentIndex++] = nextInt;
				 System.out.println("Added: " + nextInt);
			 } catch (NumberFormatException ex){
				 System.out.println("Error! Number format exception!");
			 }			
		}
	}
}