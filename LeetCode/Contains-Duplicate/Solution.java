1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int ele: nums){
5            if (set.contains(ele)) return true;
6            else set.add(ele);
7        }
8        return false;
9    }
10}