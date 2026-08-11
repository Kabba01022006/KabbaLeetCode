1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.toLowerCase();
4        StringBuilder sb = new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            char ch = s.charAt(i);
7            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
8                sb.append(s.charAt(i));
9            }
10        }
11        String s1 = sb.toString();
12        String s2 = sb.reverse().toString();
13
14        return s1.equals(s2);
15    }
16}