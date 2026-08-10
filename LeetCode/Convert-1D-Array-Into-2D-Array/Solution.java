1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3        if(m*n != original.length) return new int[0][0];
4        int[][] ans = new int[m][n];
5        for(int i=0;i<m;i++){
6            for(int j=0;j<n;j++){
7                int idx = i*n + j;
8                ans[i][j] = original[idx];
9            }
10        }
11        return ans;
12    }
13}