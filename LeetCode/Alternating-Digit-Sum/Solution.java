1class Solution {
2    public int alternateDigitSum(int n) {
3    int original=n;
4    int count=0;
5    while(n!=0){
6        n=n/10;
7        count++;
8    }
9    int sign;
10    if(count%2==0) sign=-1;
11    else sign=1;
12    int sum=0;
13    while(original!=0){
14        int digit = original % 10;
15        sum=sum+digit*sign;
16        sign=-sign;
17        original=original/10;
18    }
19    return sum;
20    }
21    
22}
23