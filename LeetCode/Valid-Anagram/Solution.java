1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        int[] freq1 = new int[26];
5        int[] freq2 = new int[26];
6        for(int i=0;i<s.length();i++){
7            freq1[s.charAt(i)-'a']++;
8        }
9        for(int i=0;i<t.length();i++){
10            freq2[t.charAt(i)-'a']++;
11        }
12        for(int i=0;i<26;i++){
13            if(freq1[i]!=freq2[i]) return false;
14        }
15        return true;
16    }
17}