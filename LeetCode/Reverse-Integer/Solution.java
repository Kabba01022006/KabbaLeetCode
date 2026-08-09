1class Solution {
2    public int reverse(int x) {
3        int rev=0;
4        while(x!=0){
5            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10) return 0;
6            rev=rev*10+x%10;
7            x=x/10;
8        }
9        return rev;
10    }
11}