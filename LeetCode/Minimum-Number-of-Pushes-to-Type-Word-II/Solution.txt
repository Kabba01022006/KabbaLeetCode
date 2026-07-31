1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for(int i=0;i<word.length();i++){
5            char ch = word.charAt(i);
6            freq[ch-'a']++;
7        }
8        Arrays.sort(freq);
9        int left=0;
10        int right=freq.length-1;
11        while(left<right){
12            int temp=freq[left];
13            freq[left]=freq[right];
14            freq[right]=temp;
15            left++;
16            right--;
17        }
18        int clicks=0;
19        for(int i=0;i<freq.length;i++){
20            clicks = clicks + ((i/8)+1)*freq[i];
21        }
22        return clicks;
23    }
24}