1class Solution {
2    public int[] constructRectangle(int area) {
3        int small = (int)Math.sqrt(area);
4        while(area % small !=0){
5            small--;
6        }
7        int large = area / small;
8        int[] arr = {large,small};
9        return arr;
10    }
11}