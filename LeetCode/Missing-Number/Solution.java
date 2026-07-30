1class Solution {
2    public int missingNumber(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int ele: nums){
5            set.add(ele);
6        }
7        for(int i=0;i<=nums.length;i++){
8            if(!set.contains(i)) return i;
9        }
10        return 0;
11    }
12}