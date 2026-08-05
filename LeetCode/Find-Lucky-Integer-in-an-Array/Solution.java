1class Solution {
2    public int findLucky(int[] arr) {
3        int[] freq = new int[501];
4        for(int i=0;i<arr.length;i++){
5            freq[arr[i]]++;
6        }
7        int max=0;
8        for(int i=0;i<freq.length;i++){
9            if(freq[i]==i){
10                max=Math.max(i,max);
11            }
12        }
13        if(max==0) return -1;
14        else return max;
15    }
16}