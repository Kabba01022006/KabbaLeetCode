1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        //handle the edge case
4        if(nums.length==1){
5            if(k>nums[0]) return 1;
6            else return 0;
7        }
8        int left=0;
9        int right=0;
10        int pro=1;
11        int count=0;
12        while(right<nums.length){
13
14            pro=pro*nums[right];
15
16            while(pro>=k){
17                pro=pro/nums[left];
18                left++;
19            }
20            count = count + (right-left+1); //very very important (calculates and adds the number of subarrays at each point of our valid window)
21
22            // counts the number of valid subarrays ending at 'right'
23
24            //everyTime a valid window is found, the number of subarrays it adds == len of that window
25            right++;
26        }
27        return count;
28    }
29}