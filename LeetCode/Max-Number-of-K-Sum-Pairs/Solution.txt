1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int ele:nums){
5            map.put(ele,map.getOrDefault(ele,0)+1);
6        }
7        int operations=0;
8        for(int ele:nums){
9            if(map.get(ele)==0) continue;
10            map.put(ele,map.getOrDefault(ele,0)-1);
11            if(map.containsKey(k-ele) && map.get(k-ele)>0){
12                operations++;
13                map.put(k-ele,map.getOrDefault(k-ele,0)-1);
14            }
15            else{
16                map.put(ele,map.getOrDefault(ele,0)+1);
17            }
18        }
19        return operations;
20    }
21}