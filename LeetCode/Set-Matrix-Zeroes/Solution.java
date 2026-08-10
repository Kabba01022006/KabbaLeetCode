1class Solution {
2    public void setZeroes(int[][] matrix) {
3        boolean[] rows = new boolean[matrix.length];
4        boolean[] cols = new boolean[matrix[0].length];
5        for(int i=0;i<rows.length;i++){
6            for(int j=0;j<cols.length;j++){
7                if(matrix[i][j]==0){
8                    rows[i]=true;
9                    cols[j]=true;
10                }
11            }
12        }
13        for(int i=0;i<rows.length;i++){
14            for(int j=0;j<cols.length;j++){
15                if(rows[i]==true || cols[j]==true){  //(rows[i] || cols[j])
16                    matrix[i][j]=0;
17                }
18            }
19        }
20    }
21}