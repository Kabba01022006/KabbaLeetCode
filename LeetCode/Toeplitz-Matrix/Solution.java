1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        for(int i=0;i<rows-1;i++){
6            for(int j=0;j<cols-1;j++){
7                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
8            }
9        }
10        return true;
11    }
12}