1class Solution {
2    public int minimumPushes(String word) {
3        int[] freq = new int[26];
4        for(int i=0;i<word.length();i++){
5            char ch = word.charAt(i);
6            freq[ch-'a']++;
7        }
8        if(freq.length==1){
9            return freq[0];
10        }
11        Arrays.sort(freq);
12        int left=0;
13        int right=freq.length-1;
14        while(left<right){
15            int temp=freq[left];
16            freq[left]=freq[right];
17            freq[right]=temp;
18            left++;
19            right--;
20        }
21        long clicks=0;
22        for(int i=0;i<freq.length;i++){
23            clicks = clicks + ((i/8)+1)*freq[i];
24        }
25        return (int)clicks;
26    }
27}