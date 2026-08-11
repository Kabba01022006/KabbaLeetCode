1class Solution {
2    public int lengthOfLastWord(String s) {
3        s=s.trim();
4        int i=s.length()-1;
5        while(i>=0 && s.charAt(i)!=' '){
6            i--;
7        }
8        return (s.length()-i-1);
9    }
10}