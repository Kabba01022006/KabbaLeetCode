1class Solution {
2    public int maximizeSum(int[] nums, int k) {
3        int score=0;
4        int max=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>max) max=nums[i];
7        }
8        while(k>0){
9            score=score+max;
10            max++;
11            k--;
12        }
13        return score;
14    }
15}