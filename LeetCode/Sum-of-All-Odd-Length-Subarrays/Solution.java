1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int totalSum=0;
4        for(int i=0;i<arr.length;i++){
5            int sum=0;
6            for(int j=i;j<arr.length;j++){
7                sum+=arr[j];
8                int dist=j-i-1;
9                if(dist%2!=0){
10                    totalSum+=sum;
11                }
12            }
13        }
14        return totalSum;
15    }
16}