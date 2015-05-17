//Make a class MatrixChecker with three methods:
//• isSymmetrical(int[]) takes an array of int and returns true if the array is symmetrical and false otherwise. An array is symetrical if the element at [0] is the same as the element at [length-1], the element at [1] is the same as the element at [length-2], etc.
//• isSymmetrical(int[][]) takes an bidimensional array of int and returns true if the matrix is symmetrical and false otherwise. An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.
//• isTriangular(int[][]) takes an bidimensional array of int and returns true if the matrix is triangular1 and false otherwise. An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
//Add some methods to your Matrix class from the other exercise to perform tests on the matrices you create using the methods from MatrixChecker. (Hint: these methods will need to create objects of type MatrixChecker).
//

public class ex5{
    
    public static void main(String[] args) {
        Matrix aMatrix = new Matrix(6, 6);
        System.out.println(aMatrix.toString());
        
        String newRow = "11, 12, 13, 14, 15, 16";
        for (int i = 0; i < 6; i ++){
            aMatrix.setRow(i, newRow);
        }
        
        String newCol = "21, 22, 23, 23, 22, 21";
        aMatrix.setCol(3, newCol);
        aMatrix.setRow(3, newCol);
        
        aMatrix.prettyPrint();
        System.out.println("matrix symmetry: " + String.valueOf(aMatrix.isMatrixSymmetric()));
        System.out.println("row symmetry: " + String.valueOf(aMatrix.isRowSymmetric(3)));

        for (int i = 0; i < 6; i ++){
            for (int j = 0; j < 6; j++){
                aMatrix.setElement(i, j, (i > j) ? 0 : 1);
            }
        }
        aMatrix.prettyPrint();
        System.out.println("matrix triangular: " + String.valueOf(aMatrix.isMatrixTriangular()));
    }
}