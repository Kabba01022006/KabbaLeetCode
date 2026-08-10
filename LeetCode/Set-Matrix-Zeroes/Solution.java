1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int[] rowZero = new int[matrix.length];
4        int[] colZero = new int[matrix[0].length];
5        for(int i=0;i<rowZero.length;i++){
6            rowZero[i]=69;
7        }
8        for(int j=0;j<colZero.length;j++){
9            colZero[j]=69;
10        }
11        //check if any row has atleast 1 zero
12        for(int i=0;i<matrix.length;i++){
13            for(int j=0;j<matrix[0].length;j++){
14                if(matrix[i][j]==0){
15                    rowZero[i]=0;
16                }
17            }
18        }
19        //check if any column has one zero
20        for(int j=0;j<matrix[0].length;j++){
21            for(int i=0;i<matrix.length;i++){
22                if(matrix[i][j]==0){
23                    colZero[j]=0;
24                }
25            }
26        }
27        //convert the matrix into zeroes accordingly
28        //rows first
29        for(int i=0;i<matrix.length;i++){
30            int left=0;
31            int right=matrix[0].length;
32            if(rowZero[i]==0){
33                while(left<right){
34                    matrix[i][left] = 0;
35                    left++;
36                }
37            }
38        }
39        //now columns
40        for(int j=0;j<matrix[0].length;j++){
41            int top=0;
42            int bottom=matrix.length;
43            if(colZero[j]==0){
44                while(top<bottom){
45                    matrix[top][j] = 0;
46                    top++;
47                }
48            }
49        }
50    }
51}