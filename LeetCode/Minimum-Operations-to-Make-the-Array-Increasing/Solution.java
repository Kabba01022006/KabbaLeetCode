1class Solution {
2    public int minOperations(int[] nums) {
3        int i=0;
4        int j=1;
5        int ops=0;
6        while(j<nums.length){
7            if(nums[i]<nums[j]){
8                i++;
9                j++;
10            }
11            else if(nums[i]>=nums[j]){
12                int diff =nums[i]-nums[j]+1;
13                nums[j]+=diff;
14                ops+=diff;
15            }
16        }
17        return ops;
18    }
19}