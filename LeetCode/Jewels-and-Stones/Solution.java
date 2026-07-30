1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        HashSet<Character> hasJewels = new HashSet<>();
4        for(int i=0;i<jewels.length();i++){
5            hasJewels.add(jewels.charAt(i));
6        }
7        int count=0;
8        for(int i=0;i<stones.length();i++){
9            if(hasJewels.contains(stones.charAt(i))){
10                count++;
11            }
12        }
13        return count;
14    }
15}