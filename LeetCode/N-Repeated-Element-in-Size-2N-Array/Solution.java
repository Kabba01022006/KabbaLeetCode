1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        int[] freq = new int[10001];
4        for(int i=0;i<nums.length;i++){
5            freq[nums[i]]++;
6            if(freq[nums[i]]>1) return nums[i];
7        }
8        return 0;
9    }
10}