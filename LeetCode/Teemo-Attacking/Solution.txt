1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int len=timeSeries.length;
4        int total=0;
5        for(int i=1;i<len;i++){
6            total += Math.min(timeSeries[i]-timeSeries[i-1],duration);
7        }
8        total+=duration;
9        return total;
10    }
11}