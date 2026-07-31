1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        char[] s1 = s.toCharArray();
5        char[] s2 = t.toCharArray();
6        Arrays.sort(s1);
7        Arrays.sort(s2);
8        for(int i=0;i<s1.length;i++){
9            if(s1[i]!=s2[i]) return false;
10        }
11        return true;
12    }
13}