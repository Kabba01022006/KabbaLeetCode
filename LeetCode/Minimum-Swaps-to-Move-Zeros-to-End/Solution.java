1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int i=0;
4        int j=nums.length-1;
5        int count=0;
6        while(i<j){
7            if(nums[j]==0){
8                j--;
9            }
10            else if(nums[i]==0 && nums[j]!=0){
11                int temp=nums[i];
12                nums[i]=nums[j];
13                nums[j]=temp;
14                count++;
15                i++;
16                j--;
17            }
18            else if(nums[i]!=0 && nums[j]!=0){
19                i++;
20            }
21            else if(nums[i]!=0 && nums[j]==0){
22                i++;
23            }
24            else if(nums[i]==0 && nums[j]==0){
25                j--;
26            }
27        }
28        return count;
29    }
30}