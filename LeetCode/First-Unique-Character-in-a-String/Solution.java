1class Solution {
2    static{
3        int sum=0;
4        for(int i=0;i<10000;i++){
5            sum+=i;
6        }
7    }
8    public static int firstUniqChar(String s) {
9        int freq[] = new int[26];
10        for(int i=0;i<s.length();i++){
11            freq[s.charAt(i)-'a']++;
12        }
13        for(int i=0;i<s.length();i++){
14            if(freq[s.charAt(i)-'a']==1){
15                return i;
16            }
17        }
18        return -1;
19    }
20}