public class MatrixChecker{

    public boolean isSymmetrical(int[] row){
        boolean hasSymmetry = true;
        int lastIndex = row.length - 1;
        for (int i = 0; i < row.length / 2; i++){
            if (row[i] != row[lastIndex - i]) hasSymmetry = false;
        }
        
        return hasSymmetry;
    }
    
    public boolean isSymmetrical(int[][] matrix){
        boolean isSymmetrical = true;
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != matrix[j][i]) isSymmetrical = false;
            }
        }
        return isSymmetrical;
    }
    
    public boolean isTriangular(int[][] matrix){
        boolean isTriangular = true;
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++){
                if ( i > j)
                    if (matrix[i][j] != 0) isTriangular = false;
            }
        }
        return isTriangular;
    }
}