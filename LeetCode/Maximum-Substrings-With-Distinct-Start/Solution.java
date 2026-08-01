1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> set = new HashSet<>();
4        int count=0;
5        for(int i=0;i<s.length();i++){
6            if(!set.contains(s.charAt(i))){
7                count++;
8                set.add(s.charAt(i));
9            }
10        }
11        return count;
12    }
13}