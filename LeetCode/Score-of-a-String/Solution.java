1class Solution {
2    public int scoreOfString(String s) {
3        int i=1;
4        int sum=0;
5        while(i<s.length()){
6            sum+=Math.abs(s.charAt(i)-s.charAt(i-1));
7            i++;
8        }
9        return sum;
10    }
11}