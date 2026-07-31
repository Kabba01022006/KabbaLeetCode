1class Solution {
2    public int removeDuplicates(int[] nums) {
3        TreeSet<Integer> set = new TreeSet<>();
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            set.add(nums[i]);
7        }
8        for(int i=0;i<n;i++){
9            nums[i]=0;
10        }
11        int i=0;
12        for(int ele : set){
13            nums[i]=ele;
14            i++;
15        }
16        return set.size();
17    }
18}