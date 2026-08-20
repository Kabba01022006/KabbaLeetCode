1// class Solution {
2//     public int removeDuplicates(int[] nums) {
3//         int l=0;
4//         int r=0;
5//         while(r<nums.length){
6//             if(nums[l]==nums[r]){
7//                 r++;
8//             }
9//             else{
10//                 l++;
11//                 nums[l]=nums[r];
12//                 r++;
13//             }
14//         }
15//         return l+1;
16//     }
17// }
18
19class Solution {
20    public int removeDuplicates(int[] nums) {
21        int l=0;
22        int r=0;
23        while(r<nums.length){
24            if(nums[l]!=nums[r]){
25                l++;
26                nums[l]=nums[r];
27            }
28            r++;
29        }
30        return l+1;
31    }
32}