1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp=n;
4        int sum=0;
5        int pro=1;
6        while(temp!=0){
7            sum+=temp%10;
8            pro*=temp%10;
9            temp=temp/10;
10        }
11        return (n%(pro+sum)==0);
12    }
13}