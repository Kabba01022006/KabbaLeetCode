1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int[] freq = new int[101];
4        List<Integer> list = new ArrayList<>();
5        int min = Integer.MAX_VALUE;
6        int max = Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            min = Math.min(min,nums[i]);
9            max = Math.max(max,nums[i]);
10        }
11        for(int i=0;i<nums.length;i++){
12            freq[nums[i]]++;
13        }
14        for(int i=min;i<=max;i++){
15            if(freq[i]==0){
16                list.add(i);
17            }
18        }
19        return list;
20    }
21}