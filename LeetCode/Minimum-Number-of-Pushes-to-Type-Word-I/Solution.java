1class Solution {
2    public int minimumPushes(String word) {
3        int total=0;
4        int n = word.length();
5        for(int i=0;i<n;i++){
6            total=total+(i/8)+1;
7        }
8        return total;
9    }
10}