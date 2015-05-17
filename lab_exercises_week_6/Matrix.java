import java.util.Scanner;

public class Matrix {
	int[][] theMatrix;
	int numRows;
	int numCols;
	
	public Matrix(int rows, int cols){
		this.numRows = rows;
		this.numCols = cols;
		theMatrix = new int[this.numCols][this.numRows];
		for (int i = 0; i < cols; i++)
			for (int j = 0; j < rows; j++)
				theMatrix[j][i] = 1;
	}
	
	public void setElement(int row,int col,int val){
		if (this.isRowInBounds(row) && this.isColInBounds(col))
			theMatrix[row][col] = val;		
	}
	
	public void setRow(int rowIndex, String rowData){
		if (!this.isRowInBounds(rowIndex)) return;
		Scanner sc = new Scanner(rowData);
		sc.useDelimiter(", ");
		int[] newData = new int[numCols];
		int currentIndex = 0;
		while (sc.hasNext()) {
			 if (sc.hasNextInt()){
				 newData[currentIndex++] = sc.nextInt();				
			 } else {
				 sc.next();
			 }
		}		
		if (newData.length == numCols){
			for (int i =0; i < numCols; i++){
				theMatrix[rowIndex][i] = newData[i];				
			}
		}				
	}
	
	public void setCol(int colIndex, String colData){
		if (!this.isColInBounds(colIndex)) return;
		Scanner sc = new Scanner(colData);
		sc.useDelimiter(", ");
		int[] newData = new int[numRows];
		int currentIndex = 0;
		while (sc.hasNext()) {
			 if (sc.hasNextInt()){
				 newData[currentIndex++] = sc.nextInt();
			 } else {
				 sc.next();
			 }
		}		
		if (newData.length == numRows){
			for (int i =0; i < numRows; i++){
				theMatrix[i][colIndex] = newData[i];
			}
		}		
	}	
	
	public String toString(){
		String theString = "[";
		for (int i = 0; i < numRows; i++){
			for (int j = 0; j < numCols; j++){
				theString += String.valueOf(theMatrix[i][j]);
				if (j != numCols - 1) theString += ", ";
			}
			if (i != numRows - 1) theString += "; ";
		}
		return theString + "]";
	}
	
	public void prettyPrint(){
		for (int i = 0; i < numRows; i++){
			for (int j = 0; j < numCols; j++){
				System.out.print("\t" + String.valueOf(theMatrix[i][j]));
			}
			System.out.println();
		}
	}
	
	private boolean isRowInBounds(int rowIndex){
		return (rowIndex < this.numRows && rowIndex >= 0) ? true : false;
	}
	
	private boolean isColInBounds(int colIndex){
		return (colIndex < this.numCols && colIndex >= 0) ? true : false;
	}
	
	/* ex 5 */
	public boolean isRowSymmetric(int row){
		MatrixChecker checker = new MatrixChecker();
		return checker.isSymmetrical(theMatrix[row]);
	}
	
	public boolean isMatrixSymmetric(){
		MatrixChecker checker = new MatrixChecker();
		return checker.isSymmetrical(theMatrix);
	}
	
	public boolean isMatrixTriangular(){
		MatrixChecker checker = new MatrixChecker();
		return checker.isTriangular(theMatrix);	
	}
	
	/* ex 4*/
	public void setMatrix(String matrixAsString) {
		int currentIndex = 0;
		for (int i = 0; i < numRows; i++){
			String row = "";
			if (currentIndex < matrixAsString.length()){
				while (matrixAsString.charAt(currentIndex) != ';'){
					if (currentIndex == matrixAsString.length() - 1){
						row += matrixAsString.substring(currentIndex);
					} else {
						row += matrixAsString.substring(currentIndex,currentIndex + 1);
					}
					currentIndex++;
					if (currentIndex == matrixAsString.length()) break;
				}
				this.setRow(i, row);
				currentIndex++;
			}
		}
		
	}	
	
}
