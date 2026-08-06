1class Solution {
2    public int smallestNumber(int n, int t) {
3        int pro=1;
4        int ori=n;
5        int keep=n;
6        if(t==1) return n;
7        if(n<=t) return t;
8        while(pro%t!=0){
9            pro=1;
10            ori=keep;
11            while(ori!=0){
12                pro=pro*(ori%10);
13                ori=ori/10;
14            }
15            if(pro%t==0) return keep;
16            else keep++;
17        }
18        return 0;
19    }
20}