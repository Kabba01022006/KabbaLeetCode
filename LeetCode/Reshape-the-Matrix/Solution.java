1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        if(r*c != mat.length*mat[0].length) return mat;
4        int rows = mat.length;
5        int cols = mat[0].length;
6        int ans[][] = new int[r][c];
7        for(int i=0;i<rows;i++){
8            for(int j=0;j<cols;j++){
9                int index = (i * cols) + j ; //index = currentRow * cols + currentColumn 
10                //by doing this we get the flattenedIndex
11                ans[index / c][index % c] = mat[i][j] ;
12
13                //rowNumber = Index/noOfColumns
14                //colNumber = Index%noOfColumns
15            }
16        }
17        return ans;
18    }
19}