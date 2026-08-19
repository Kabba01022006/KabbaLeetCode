1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int arr[] = new int[2];
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            int comp = (target - nums[i]);
7            if(map.containsKey(comp)){
8                arr[0]=map.get(comp);
9                arr[1]=i;
10            }
11            else{
12                map.put(nums[i],i);
13            }
14        }
15        return arr;
16    }
17}