class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        
        for (int row = 0; row < transposed.length; row++){
            for (int col = 0; col < transposed[row].length; col++){
                transposed[row][col] = matrix[col][row];
            }
        }
        return transposed;
    }
}