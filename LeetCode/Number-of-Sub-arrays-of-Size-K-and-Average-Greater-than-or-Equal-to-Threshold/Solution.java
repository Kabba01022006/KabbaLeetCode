1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int left=0;
4        int right=k-1;
5        int sum=0;
6        int count=0;
7        for(int i=0;i<=right;i++){
8            sum+=arr[i];
9        }
10        int avg = sum/k;
11        if(avg>=threshold) count++;
12        while(right<arr.length-1){
13            sum=sum-arr[left];
14            left++;
15            right++;
16            sum=sum+arr[right];
17            avg=sum/k;
18            if(threshold==0) count++;
19            else if(avg>=threshold) count++;
20        }
21        return count;
22    }
23}