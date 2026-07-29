1class Solution {
2    public int addDigits(int num) {
3        int sum=0;
4        while(num>9){
5            int temp = num;
6            sum = 0;
7            while(temp!=0){
8                sum=sum+temp%10;
9                temp=temp/10;
10            }
11            num=sum;
12        }
13        return num;
14    }
15}