1class Solution {
2    public int removeDuplicates(int[] nums) {
3        ArrayList<Integer> list = new ArrayList<>();
4        for(int ele:nums){
5            if(!list.contains(ele)){
6                list.add(ele);
7            }
8            else{
9                continue;
10            }
11        }
12        for(int i=0;i<list.size();i++){
13            nums[i] = list.get(i);
14        }
15        return list.size();
16    }
17}