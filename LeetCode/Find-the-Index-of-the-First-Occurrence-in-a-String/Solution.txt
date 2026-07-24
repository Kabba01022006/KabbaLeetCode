1class Solution {
2    public int strStr(String haystack, String needle) {
3        int hayLen = haystack.length();
4        int needLen = needle.length();
5        int n = hayLen - needLen;
6        for(int i=0;i<=n;i++){
7            if(haystack.substring(i,i+needLen).equals(needle)) return i;
8        }
9        return -1;
10    }
11}