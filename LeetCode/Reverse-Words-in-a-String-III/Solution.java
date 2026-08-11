1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder ans = new StringBuilder();
4        int i=0;
5        while(i<s.length()){
6            StringBuilder word = new StringBuilder();
7            while(i<s.length() && s.charAt(i)!=' '){
8                word.append(s.charAt(i));
9                i++;
10            }
11            word.reverse();
12            ans.append(word);
13            while(i<s.length() && s.charAt(i)==' '){
14                ans.append(s.charAt(i));
15                i++;
16            }
17        }
18        return ans.toString();
19    }
20}