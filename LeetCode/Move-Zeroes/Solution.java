1class Solution {
2    public void moveZeroes(int[] nums) {
3        //the logic is to keep the j always at a zero i.e. it'll be our write pointer
4
5        //first find the first zero, as we know the elements before the first zero will be as it is , so we will find first zero , put j at that first zero and then put our read pointer i.e. i at j+1 and it will start reading
6        int j=-1;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==0){
9                j=i;
10                break;
11            }
12        }
13        //if no zeroes were found then means j will remain same i.e. -1 , so well simply return
14        if(j==-1) return;
15        
16        //read pointer
17        int i=j+1;
18        while(i<nums.length){
19            if(nums[i]!=0){
20                int temp = nums[i];
21                nums[i] = nums[j];
22                nums[j] = temp;
23                i++;
24                j++;
25            }
26            else{
27                i++;
28            }
29        }
30    }
31}
32//the core algo logic is that if we found 0 at i , we simply do i++ , if we found a non zero at i we swap and we do i++ j++