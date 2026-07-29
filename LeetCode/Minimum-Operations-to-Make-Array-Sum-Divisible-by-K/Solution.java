1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6        }
7        int count=0;
8        while(sum%k!=0){
9            sum=sum-1;
10            count++;
11        }
12        return count;
13    }
14}