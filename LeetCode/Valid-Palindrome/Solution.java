1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
4        char[] ori = s.toCharArray();
5        int i=0;
6        int j=ori.length-1;
7        while(i<j){
8            if(ori[i]!=ori[j]) return false;
9            i++;
10            j--;
11        }
12        return true;
13    }
14}