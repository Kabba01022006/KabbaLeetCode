1class Solution {
2    public long maxPairStrength(int[] nums) {
3        long maxStr=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                long g = gcd(nums[i],nums[j]);
7                long str = ((long)nums[i]*nums[j])/(g*g);
8                if(str>maxStr){
9                    maxStr=str;
10                }
11            }
12        }
13        return maxStr;
14    }
15    public long gcd(long a, long b){
16    if(b==0) return a;
17    return gcd(b,a%b);
18    }
19}
20