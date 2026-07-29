1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int freq[] = new int[101];
4        for(int i=0;i<nums.length;i++){
5            freq[nums[i]]++;
6        }
7        int total=0;
8        for(int ele : freq){
9            int pairs=0;
10            if(ele>=2){
11                pairs = (ele*(ele-1))/2;
12            }
13            total=total+pairs;
14        }
15        return total;
16    }
17}