1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> list = new ArrayList<>();
4        int i=0;
5        int j=0;
6        while(i<nums.length && j<nums.length){
7            int elem = nums[i];
8            list.add(index[i],elem);
9            i++;
10            j++;
11        }
12        int[] arr = new int[nums.length];
13        for(int k=0;k<nums.length;k++){
14            arr[k]=list.get(k);
15        }
16        return arr;
17    }
18}