1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] ans = new int[2];
4        HashMap<Integer,Integer> map = new HashMap<>();
5        //we need a number x that,
6        // x + nums[i] = target
7        // so x = target-nums[i];
8        for(int i=0;i<nums.length;i++){
9            int complement = target - nums[i];
10            if(map.containsKey(complement)){
11                ans[0] = i;
12                ans[1] = map.get(complement);
13                //we might use break here but as the question states that only one such pair exists so no necessary need for break
14            }
15            else{
16                map.put(nums[i],i);
17            }
18        }
19        return ans;
20    }
21}