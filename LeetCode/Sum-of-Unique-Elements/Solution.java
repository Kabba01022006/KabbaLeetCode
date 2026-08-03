1// class Solution {
2//     public int sumOfUnique(int[] nums) {
3//         HashMap<Integer,Integer> map = new HashMap<>();
4//         int sum=0;
5//         for(int i=0;i<nums.length;i++){
6//             if(map.containsKey(nums[i])){
7//                 map.put(nums[i],map.get(nums[i])+1);
8//             }
9//             else{
10//                 map.put(nums[i],1);
11//             }
12//         }
13//         for(int ele : map.keySet()){
14//             if(map.get(ele)==1){
15//                 sum+=ele;
16//             }
17//         }
18//         return sum;
19//     }
20// }
21
22class Solution {
23    public int sumOfUnique(int[] nums) {
24        HashMap<Integer,Integer> map = new HashMap<>();
25        int sum=0;
26        for(int i=0;i<nums.length;i++){
27            if(map.containsKey(nums[i])){
28                map.put(nums[i],map.get(nums[i])+1);
29            }
30            else{
31                map.put(nums[i],1);
32            }
33        }
34        for(int ele:nums){
35            if(map.get(ele)==1) sum+=ele;
36        }
37        return sum;
38    }
39}