1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int matLen = accounts.length;
4        int arrLen = accounts[0].length;
5        int maxWealth=0;
6        for(int i=0;i<matLen;i++){
7            int wealth=0;
8            for(int j=0;j<arrLen;j++){
9                wealth=wealth+accounts[i][j];
10                if(wealth>=maxWealth) maxWealth=wealth;
11            }
12        }
13        return maxWealth;
14    }
15}