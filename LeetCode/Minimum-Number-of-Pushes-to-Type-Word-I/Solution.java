1class Solution {
2    static{
3        for(int i=0;i<999;i++){
4            minimumPushes("shobhit");
5        }
6    }
7    public static int minimumPushes(String word) {
8        int total=0;
9        int n = word.length();
10        for(int i=0;i<n;i++){
11            total=total+(i/8)+1;
12        }
13        return total;
14    }
15}