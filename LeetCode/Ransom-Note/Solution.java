1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        //can't be done with .contains() method as order matters too here in this problem
4        //use frequency array 
5        int[] freq = new int[26];
6        //build a library of characters that magazine has
7        for(int i=0;i<magazine.length();i++){
8            char ch = magazine.charAt(i);
9            freq[ch-97]++;
10        }
11        //build a library of characters that ransomNote has
12        for(int i=0;i<ransomNote.length();i++){
13            char ch = ransomNote.charAt(i);
14            freq[ch-97]--;
15        }
16        //we subtracted ransomNote as if we assume that ransomNote cannot be constructed by magazine means ransomNote will have more repeated characters than magazine,so in our freq array if we get any negative value. , we return false;
17
18        for(int i=0;i<freq.length;i++){
19            if(freq[i]<0) return false;
20        }
21        return true;
22    }
23}