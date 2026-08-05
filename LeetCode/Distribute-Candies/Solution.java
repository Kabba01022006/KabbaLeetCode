1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int ele:candyType){set.add(ele);}
5        return Math.min(set.size(),candyType.length/2);
6    }
7}