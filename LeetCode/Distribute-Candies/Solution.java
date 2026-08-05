1class Solution {
2    public int distributeCandies(int[] candyType) {
3        int count=0;
4        int max=candyType.length/2;
5        HashSet<Integer> set = new HashSet<>();
6        for(int i=0;i<candyType.length;i++){
7            if(!set.contains(candyType[i])){
8                set.add(candyType[i]);
9                count++;
10            }
11            else{
12                continue;
13            }
14        }
15        if(count<=max) return count;
16        else return (max);
17    }
18}