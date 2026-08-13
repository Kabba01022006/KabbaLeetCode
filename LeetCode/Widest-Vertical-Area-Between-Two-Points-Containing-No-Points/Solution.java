1class Solution {
2    public int maxWidthOfVerticalArea(int[][] points) {
3        //we need to find the max difference of any consecutive x coordinates after sorting
4        int[] xCord = new int[points.length];
5        for(int i=0;i<points.length;i++){
6            xCord[i] = points[i][0];
7        }
8        int maxDiff=0;
9        Arrays.sort(xCord);
10        for(int i=1;i<xCord.length;i++){
11            int diff = xCord[i]-xCord[i-1];
12            maxDiff = Math.max(maxDiff,diff);
13        }
14        return maxDiff;
15    }
16}