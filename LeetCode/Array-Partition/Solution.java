1import java.util.*;
2class Solution {
3    public int arrayPairSum(int[] nums) {
4        //small numbers should stay with small numbers and large number should stay with large number ----> sorting
5        Arrays.sort(nums);
6        int sum=0;
7        for(int i=0;i<nums.length;i+=2){
8            sum+=nums[i];
9        }
10
11        return sum;
12    }
13}