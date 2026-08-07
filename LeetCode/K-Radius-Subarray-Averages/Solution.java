1class Solution {
2    public int[] getAverages(int[] nums, int k) {
3        if(k==0) return nums;
4        int n=nums.length;
5        if(n==1){
6            nums[0]=-1;
7            return nums;
8        }
9        int ans[] = new int[n];
10        if(2*k + 1 > n){
11            for(int i=0;i<n;i++){
12                ans[i]=-1;
13            }
14            return ans;
15        }
16        long sum=0;
17        for(int i=0;i<k;i++){
18            ans[i]=-1;
19        }
20        for(int i=n-k;i<n;i++){
21            ans[i]=-1;
22        }
23        for(int i=0; i<2*k+1; i++){
24            sum += nums[i];
25        }
26        int left=0;
27        int curr=k;
28        int right=curr+k;
29        while(right<n){
30            ans[curr]=(int)(sum/((k*2)+1));
31            sum=sum-nums[left];
32            left++;
33            right++;
34            if(right<n){
35                sum=sum+nums[right];
36            }
37            curr++;
38        }
39        return ans;
40    }
41}