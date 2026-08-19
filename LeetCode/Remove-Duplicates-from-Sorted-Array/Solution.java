1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        int j=0;
5        if(nums.length==0) return 0;
6        while(j<nums.length){
7        if(nums[i]==nums[j]) j++;
8        else if(nums[i]!=nums[j]){
9            i++;
10            int temp=nums[i];
11            nums[i]=nums[j];
12            nums[j]=temp;
13            j++;
14        }
15        }
16        return i+1;
17    }
18}