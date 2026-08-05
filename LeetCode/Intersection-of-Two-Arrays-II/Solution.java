1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        ArrayList<Integer> list = new ArrayList<>();
4        HashMap<Integer,Integer> map1 = new HashMap<>();
5        for(int ele:nums1){
6            map1.put(ele,map1.getOrDefault(ele,0)+1);
7        }
8        for(int ele:nums2){
9            if(map1.containsKey(ele) && map1.get(ele)>0){
10                list.add(ele);
11                map1.put(ele,map1.get(ele)-1);
12            }
13        }
14        int[] ans = new int[list.size()];
15        for(int i=0;i<list.size();i++){
16            ans[i]=list.get(i);
17        }
18        return ans;
19    }
20}