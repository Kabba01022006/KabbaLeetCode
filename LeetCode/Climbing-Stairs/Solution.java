1class Solution {
2    public int climbStairs(int n) {
3        if(n==1) return 1;
4        if(n==2) return 2;
5        //identify the pattern fibonacci
6        //also learn the ways(n) = ways(n-1) + ways(n-2) concept
7        int a=1;
8        int b=1;
9        int sum=0;
10        for(int i=0;i<n-1;i++){
11            sum=a+b;
12            a=b;
13            b=sum;
14        }
15        return sum;
16    }
17}