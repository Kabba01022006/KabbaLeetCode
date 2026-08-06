1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        double sum = 0 ;
4        int l=0;
5        int r=k-1;
6        if(nums.length==1) return (double)nums[0];
7        for(int i=0;i<=r;i++){
8            sum+=nums[i];
9        }
10        double maxSum=sum;
11        while(r<nums.length-1){
12            sum-=nums[l];
13            l++;
14            r++;
15            sum+=nums[r];
16            maxSum=Math.max(maxSum,sum);
17        }
18        return maxSum/k;
19    }
20}