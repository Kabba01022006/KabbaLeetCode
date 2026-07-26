1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        List<Integer> list = new ArrayList<>();
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            min = Math.min(min,nums[i]);
9            max = Math.max(max,nums[i]);
10            set.add(nums[i]);
11        }
12        for(int i=min;i<=max;i++){
13            if(!(set.contains(i))){
14                list.add(i);
15            }
16        }
17        return list;
18    }
19}