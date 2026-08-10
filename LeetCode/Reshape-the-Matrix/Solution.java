1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3
4        int rows = mat.length;
5        int cols = mat[0].length;
6
7        if(rows*cols != r*c) return mat;
8        int[][] ans = new int[r][c];
9        int[] flat = new int[rows * cols];
10        int k=0;
11        while(k<flat.length){
12            for(int i=0;i<rows;i++){
13                for(int j=0;j<cols;j++){
14                flat[k]=mat[i][j];
15                k++;
16                }
17            }
18        }
19        k=0;
20        while(k<flat.length){
21            for(int i=0;i<r;i++){
22                for(int j=0;j<c;j++){
23                    ans[i][j] = flat[k];
24                    k++;
25                }
26            }
27        }
28        return ans;
29    }
30}