1class Solution {
2    public boolean isThree(int n) {
3        int count=0;
4        for(int i=2;i<n;i++){
5            //or i=1;i<=n;
6            if(n%i==0) count++;
7        }
8        if(count==1) return true; //count==3
9        else return false;
10    }
11}