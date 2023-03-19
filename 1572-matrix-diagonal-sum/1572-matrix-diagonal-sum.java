class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int sum = 0;
        
        while(i < mat.length && j < mat.length) {
            sum += mat[i][j];
            i++;
            j++;
        }
        
        i = 0;
        j = mat.length - 1;
        
        while(i < mat.length && j >= 0) {
            sum += mat[i][j];
            i++;
            j--;
        }
        
        if(mat.length % 2 != 0) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        
        return sum;
        
    }
}