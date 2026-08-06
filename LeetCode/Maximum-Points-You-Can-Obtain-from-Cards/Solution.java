1class Solution {
2    public int maxScore(int[] arr, int k) {
3        int lsum=0;
4        int rsum=0;
5        int maxSum=0;
6        int sum=lsum+rsum;
7        int lIdx=k-1;
8        //first take all from left
9        for(int i=0;i<=lIdx;i++){
10            lsum+=arr[i];
11        }
12        sum=lsum+rsum;
13        maxSum = Math.max(sum,maxSum); //left total side sum 
14        int rIdx=arr.length-1;
15        while(lIdx>=0){
16            lsum=lsum-arr[lIdx];
17            lIdx--;
18            rsum=rsum+arr[rIdx];
19            rIdx--;
20            sum=lsum+rsum;
21            maxSum = Math.max(sum,maxSum);
22        }
23        return maxSum;
24    }
25}