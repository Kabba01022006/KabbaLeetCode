1class Solution {
2    public int alternateDigitSum(int n) {
3        int ori=n;
4        int count=0;
5        while(n!=0){
6            n=n/10;
7            count++;
8        }
9        int[] arr = new int[count];
10        for(int i=arr.length-1;i>=0;i--){
11            int digit = ori%10;
12            arr[i]=digit;
13            ori=ori/10;
14        }
15        int sum=0;
16        for(int i=0;i<arr.length;i++){
17            if(i%2==0) sum=sum+arr[i];
18            else sum=sum-arr[i];
19        }
20        return sum;
21    }
22}