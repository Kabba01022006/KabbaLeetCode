1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=1;
4        int count=1;
5        for(int j=1;j<nums.length;j++){
6            if (nums[j]==nums[j-1]){
7                count++;
8            }
9            else{
10                count=1;
11            }
12            if(count<=2){
13                nums[i]=nums[j];
14                i++;
15            }
16        }
17        return i;
18    }
19}