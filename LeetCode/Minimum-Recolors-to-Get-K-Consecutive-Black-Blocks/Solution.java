1class Solution {
2    public int minimumRecolors(String blocks, int k) {
3        int count=0;
4        for(int i=0;i<k;i++){
5            if(blocks.charAt(i)=='W'){
6                count++;
7            }
8        }
9        int minCount=count;
10        int left=0;
11        int right=k-1;
12        while(right<blocks.length()-1){
13            if(blocks.charAt(left)=='W') count--;
14            left++;
15            right++;
16            if(blocks.charAt(right)=='W')count++;
17            minCount=Math.min(minCount,count);
18        }
19        return minCount;
20    }
21}