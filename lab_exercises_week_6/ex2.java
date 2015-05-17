/*Create a new Java class called ArrayCopier with a method called copy that takes two arrays of integers as param-
eters. The method should copy the elements of the first array (you can call it src, from “source”) to the second
one (dst, from “destination”) as much as possible.
If the second array is smaller, then only those elements that fit will be copied. If the second array is larger, it
will be filled with zeroes.
Write a program that creates an object of this class and uses this method to copy some arrays in all three cases:
• Both arrays are of the same size.
• The source array is longer.
• The source array is shorter.*/

public class ex2 {

	
	
	public static void main(String[] args) {
		int[] arrayA = { 1, 2, 3};		
		int[] arrayB = new int[3];
				
		ArrayCopier.copy(arrayA, arrayB); // same size
		for (int i = 0; i < arrayB.length; i++){
			System.out.print(String.valueOf(arrayB[i]) + ", ");
		}
		System.out.println();
			
		int[] arrayC = {4, 5, 6, 7, 8};
		
		ArrayCopier.copy(arrayC, arrayB); // source is longer
		for (int i = 0; i < arrayB.length; i++){
			System.out.print(String.valueOf(arrayB[i]) + ", ");
		}
		System.out.println();
		
		int[] arrayD = new int[5];
		ArrayCopier.copy(arrayA, arrayD); // dest is longer
		for (int i = 0; i < arrayD.length; i++){
			System.out.print(String.valueOf(arrayD[i]) + ", ");
		}
		System.out.println();
		
	}
	
	
}