1class Solution {
2    public int maxProfit(int[] prices) {
3        if (prices.length==1) return 0;
4        int i=prices.length-2;
5        int j=prices.length-1;
6        int maxPro=0;
7        int maxFuture=0;
8        while(i>=0){
9            maxFuture = Math.max(maxFuture,prices[j]);
10            maxPro = Math.max(maxPro,maxFuture-prices[i]);
11            i--;
12            j--;
13        }
14        return maxPro;
15    }
16}