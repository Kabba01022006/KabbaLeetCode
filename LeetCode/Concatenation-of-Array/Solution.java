1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] newArr = new int[nums.length*2];
4        for(int i=0;i<nums.length;i++){
5            newArr[i]=nums[i];
6            newArr[i+nums.length]=nums[i];
7        }
8        return newArr;
9    }
10}