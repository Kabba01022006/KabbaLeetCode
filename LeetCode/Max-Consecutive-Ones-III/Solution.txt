1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int i=0;
4        int j=0;
5        int len=0;
6        int maxLen=0;
7        int zeroCount=0;
8        while (j < nums.length) {
9            if (nums[j] == 0) zeroCount++;
10            while (zeroCount > k) {
11                if (nums[i] == 0)
12                zeroCount--;
13                i++;
14            }
15            maxLen = Math.max(maxLen, j - i + 1);
16            j++;
17        }
18        return maxLen;
19    }
20}