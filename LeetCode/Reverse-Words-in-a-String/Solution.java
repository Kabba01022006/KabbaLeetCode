1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder newStr = new StringBuilder();
4        s = s.trim();
5        int j=0;
6        while(j<s.length()){
7            while(j<s.length() && s.charAt(j)!=' '){
8                newStr.append(s.charAt(j));
9                j++;
10            }
11            while(j<s.length() && s.charAt(j)==' '){
12                j++;
13            }
14            if(j<s.length()){
15                newStr.append(' ');
16            }
17        }
18        // now our newStr is a normal string with no leading/trailing spaces and extra spaces in between.
19
20        StringBuilder finalStr = new StringBuilder();
21        newStr.reverse();
22        int i=0;
23        while(i<newStr.length()){
24            StringBuilder word = new StringBuilder();
25            while(i<newStr.length() && newStr.charAt(i)!=' '){
26                word.append(newStr.charAt(i));
27                i++;
28            }
29            finalStr.append(word.reverse());
30            if(i<newStr.length() && newStr.charAt(i)==' '){
31                finalStr.append(' ');
32                i++;
33            }
34        }
35
36        return finalStr.toString();
37    }
38}