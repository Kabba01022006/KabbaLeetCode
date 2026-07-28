1class Solution {
2    public String truncateSentence(String s, int k) {
3        int count=0;
4        StringBuilder sb = new StringBuilder();
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)==' ') count++;
7            if(count==k) break;
8            sb.append(s.charAt(i));
9        }
10        return sb.toString();
11    }
12}