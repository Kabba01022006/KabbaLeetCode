1class Solution {
2    public boolean isPalindrome(int x) {
3        int ori=x;
4        int rev=0;
5        while(ori!=0){
6            rev=rev*10+ori%10;
7            ori/=10;
8        }
9        if(x>0) return rev==x;
10        else return rev==-1*x;
11    }
12}