1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set = new HashSet<>();
4        HashSet<Integer> result = new HashSet<>();
5        for(int ele: nums1){
6            set.add(ele);
7        }
8        for(int ele:nums2){
9            if(set.contains(ele)){
10                result.add(ele);
11            }
12        }
13        int[] arr = new int[result.size()];
14        int i=0;
15        for(int ele: result){
16            arr[i]=ele;
17            i++;
18        }
19        return arr;
20    }
21}