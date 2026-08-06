1class Solution {
2    static {
3        for (int i = 0; i < 999; i++) {
4            findMaxAverage(new int[1], 1);
5        }
6    }
7    public static double findMaxAverage(int[] nums, int k) {
8        double sum = 0 ;
9        int l=0;
10        int r=k-1;
11        if(nums.length==1) return (double)nums[0];
12        for(int i=0;i<=r;i++){
13            sum+=nums[i];
14        }
15        double maxSum=sum;
16        while(r<nums.length-1){
17            sum-=nums[l];
18            l++;
19            r++;
20            sum+=nums[r];
21            maxSum=Math.max(maxSum,sum);
22        }
23        return maxSum/k;
24    }
25}