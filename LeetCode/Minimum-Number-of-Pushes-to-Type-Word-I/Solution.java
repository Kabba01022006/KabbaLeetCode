1class Solution {
2    public int minimumPushes(String word) {
3        int n=word.length();
4        int total=0;
5        if(n<=8){
6            total=n;
7        }
8        else if(n>8 && n<=16){
9            total=8+(n-8)*2;
10        }
11        else if(n>16 && n<=24){
12            total=24+(n-16)*3;
13        }
14        else if(n>24 && n<=26){
15            total=48+(n-24)*4;
16        }
17        return total;
18    }
19}