1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=prices[0];
4        int diff=0; 
5        int profit=0;
6        int n=prices.length;
7        
8        for(int i=1;i<n;i++){
9            diff=(prices[i]-min);
10            profit=Math.max(profit,diff);
11            min=Math.min(min,prices[i]);
12        }
13        return profit;
14    }
15}