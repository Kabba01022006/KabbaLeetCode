1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        ArrayList<Integer> list = new ArrayList<>();
4        HashMap<Integer,Integer> map1 = new HashMap<>();
5        HashMap<Integer,Integer> map2 = new HashMap<>();
6        for(int ele:nums1){
7            map1.put(ele,map1.getOrDefault(ele,0)+1);
8        }
9        for(int ele:nums2){
10            map2.put(ele,map2.getOrDefault(ele,0)+1);
11        }
12        for(int ele:map1.keySet()){
13            if(map2.containsKey(ele)){
14                int freq = Math.min(map1.get(ele),map2.get(ele));
15                while(freq!=0){
16                    list.add(ele);
17                    freq--;
18                }
19            }
20        }
21        int[] ans = new int[list.size()];
22        for(int i=0;i<list.size();i++){
23            ans[i]=list.get(i);
24        }
25        return ans;
26    }
27}