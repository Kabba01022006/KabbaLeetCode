1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        int[] freq = new int[26];
5        for(int i=0;i<s.length();i++){
6            freq[s.charAt(i)-'a']++;
7            freq[t.charAt(i)-'a']--;
8        }
9        for(int count:freq){
10            if(count!=0) return false;
11        }
12        return true;
13    }
14}