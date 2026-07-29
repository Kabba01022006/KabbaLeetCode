1class Solution {
2    public boolean isThree(int n) {
3        int count=0;
4        boolean flag=true;
5        for(int i=2;i<n;i++){
6            //or i=1;i<=n;
7            if(n%i==0) count++;
8        }
9        if(count==1) return true; //count==3
10        else return false;
11    }
12}