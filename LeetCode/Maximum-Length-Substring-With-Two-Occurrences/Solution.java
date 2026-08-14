1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int[] freq = new int[26];
4        int right=0;
5        int left=0;
6        int maxLen=0;
7        while(right<s.length()){
8            freq[s.charAt(right)-'a']++;
9            while(freq[s.charAt(right)-'a']>2){
10                freq[s.charAt(left)-'a']--;
11                left++;
12            }
13            maxLen = Math.max(maxLen,right-left+1);
14            right++;
15        }
16        return maxLen;
17    }
18}