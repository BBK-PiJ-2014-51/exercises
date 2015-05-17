// Extend your Matrix class with a method setMatrix(String) that takes a String representing the numbers to be
// put in the elements of the array separated by commas, separating rows by semicolons, e.g. 1,2,3;4,5,6;7,8,9.


public class ex4 {

	public static void main(String[] args) {
		Matrix aMatrix = new Matrix(3, 3);
		String matrixAsString = "1, 2, 3;4, 5, 6;7, 8, 9";
		aMatrix.setMatrix(matrixAsString);
		aMatrix.prettyPrint();
	}
	
}