1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum=0;
4        for(int i=0;i<arr.length;i++){
5            for(int j=i;j<arr.length;j++){
6                int dist=j-i+1;
7                if(dist%2!=0){
8                    for(int k=i;k<=j;k++){
9                        sum+=arr[k];
10                    }
11                }
12            }
13        }
14        return sum;
15    }
16}