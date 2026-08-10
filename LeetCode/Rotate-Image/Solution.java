1class Solution {
2    public void rotate(int[][] mat) {
3        //rows and cols are same so no need to take rows and cols diff , just take n or just mat.length
4        int rows = mat.length;
5        int cols = mat[0].length;
6
7        for(int i=0;i<rows;i++){
8            for(int j=i+1;j<cols;j++){
9                int temp = mat[i][j];
10                mat[i][j] = mat[j][i];
11                mat[j][i] = temp;
12            }
13        }
14        for(int i=0;i<rows;i++){
15            int left = 0;
16            int right = rows-1;
17            while(left<right){
18                int temp = mat[i][left];
19                mat[i][left] = mat[i][right];
20                mat[i][right] = temp;
21                left++;
22                right--;
23            }
24        }
25    }
26}