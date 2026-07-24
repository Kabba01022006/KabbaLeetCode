1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0 ;
4        int j = 1 ;
5        int n = nums.length;
6        int count = 0 ;
7        if(n==0) return 0;
8        while(i<n && j<n){
9            if(nums[i]==nums[j]){
10                j++;
11            }
12            else if (nums[i] != nums[j]){
13                i++;
14                nums[i] = nums[j] ; 
15                j++;
16                count++;
17            }
18        }
19        return count+1;
20    }
21}