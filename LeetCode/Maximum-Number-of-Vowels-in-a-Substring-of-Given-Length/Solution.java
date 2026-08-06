1class Solution {
2    public int maxVowels(String s, int k) {
3        int left = 0;
4        int right = k-1;
5        int count=0;
6        for(int i=0;i<=right;i++){
7            char ch = s.charAt(i);
8            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
9                count++;
10            }
11        }
12        int maxCount=count;
13        while(right<s.length()-1){
14            char l = s.charAt(left);
15            if(l=='a' || l=='e' || l=='i' || l=='o'|| l=='u'){
16                count--;
17            }
18            left++;
19            right++;
20            char r = s.charAt(right);
21            if(r=='a' || r=='e' || r=='i' || r=='o'|| r=='u'){
22                count++;
23            }
24            maxCount=Math.max(maxCount,count);
25        }
26        return maxCount;
27    }
28}