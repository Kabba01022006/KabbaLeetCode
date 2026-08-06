1class Solution {
2    public int smallestNumber(int n, int t) {
3        int pro=1;
4        int ori=n;
5        if(t==1) return n;
6        while(pro%t!=0){
7            pro=1;
8            ori=n;
9            while(ori!=0){
10                pro=pro*(ori%10);
11                ori=ori/10;
12            }
13            if(pro%t==0) return n;
14            else n++;
15        }
16        return 0;
17    }
18}