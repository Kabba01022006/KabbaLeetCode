1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int clicks=1;
5        int total=0;
6        if(n<=8){
7            total=n;
8        }
9        else if(n>8 && n<=16){
10            total=8+(n-8)*2;
11        }
12        else if(n>16 && n<=24){
13            total=24+(n-16)*3;
14        }
15        else if(n>24 && n<=26){
16            total=48+(n-24)*4;
17        }
18        return total;
19    }
20}