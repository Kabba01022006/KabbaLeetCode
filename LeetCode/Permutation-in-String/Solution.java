1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        boolean flag = true;
4        HashMap<Character,Integer> map = new HashMap<>();
5        int[] freq = new int[26];
6        for(int i=0;i<s1.length();i++){
7            char ch = s1.charAt(i);
8            freq[ch-'a']++;
9        }
10        int left=0;
11        int right=s1.length()-1;
12        int[] win = new int[26];
13        while(right<s2.length()){
14            for(int i=left;i<=right;i++){
15                win[s2.charAt(i)-'a']++;
16            }
17            if(Arrays.equals(freq,win)){
18                return true;
19            }
20            left++;
21            right++;
22            for(int i=0;i<win.length;i++){
23                win[i]=0;
24            }
25        }
26        return false;
27    }
28}