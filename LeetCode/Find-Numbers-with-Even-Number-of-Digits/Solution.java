1class Solution {
2    public int findNumbers(int[] nums) {
3        int evenCount=0;
4        for(int i=0;i<nums.length;i++){
5            int temp=nums[i];
6            int count=0;
7            while(nums[i]!=0){
8                nums[i]=nums[i]/10;
9                count++;
10            }
11            if(count%2==0) evenCount++;
12        }
13        return evenCount;
14    }
15}