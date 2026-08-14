1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int left = 0 ;
4        int right = 0 ;
5        int maxLen=0;
6        HashMap<Integer,Integer> map = new HashMap<>();
7        while(right<nums.length){
8            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
9            while(map.getOrDefault(nums[right],0)>k){
10                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
11                left++;
12            }
13            maxLen = Math.max(maxLen,right-left+1);
14            right++;
15        }
16        return maxLen;
17    }
18}