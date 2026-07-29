1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int ans=0;
4        for(int i=0;i<operations.length;i++){
5            if(operations[i].charAt(1)=='-') ans--;
6            else ans++;
7        }
8        return ans;
9    }
10}