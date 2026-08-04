1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int[] freq = new int[101];
4        List<Integer> list = new ArrayList<>();
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            freq[nums[i]]++;
9            min = Math.min(min,nums[i]);
10            max = Math.max(max,nums[i]);
11        }
12        for(int i=min;i<=max;i++){
13            if(freq[i]==0){
14                list.add(i);
15            }
16        }
17        return list;
18    }
19}