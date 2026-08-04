1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> list = new ArrayList<>();
4        for(int i=0;i<nums.length;i++){
5            int currElem = Math.abs(nums[i]);
6            if(nums[currElem-1]<0){
7                list.add(currElem);
8            }
9            else{
10                nums[currElem-1]=-nums[currElem-1];
11            }
12        }
13        return list;
14    }
15}