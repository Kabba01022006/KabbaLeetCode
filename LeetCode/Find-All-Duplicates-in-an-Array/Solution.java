1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        List<Integer> list = new ArrayList<>();
4        // for(int i=0;i<nums.length;i++){
5        //     if(nums[i]>0){
6        //         nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
7        //     }
8        //     else{
9        //         list.add();
10        //     }
11        // }
12        int[] freq = new int[100001];
13        for(int i=0;i<nums.length;i++){
14            freq[nums[i]]++;
15        }
16        for(int i=0;i<freq.length;i++){
17            if(freq[i]==2){
18                list.add(i);
19            }
20        }
21        return list;
22    }
23}