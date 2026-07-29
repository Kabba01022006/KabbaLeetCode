1int minOperations(int* nums, int numsSize){
2    int count=0;
3    if(numsSize==1){
4        count=0;
5    }
6    else{
7        for(int i=0;i<numsSize;i++){
8            for(int j=i+1;j<numsSize;j++){
9                while(nums[i]>=nums[j]){
10                    nums[j]+=1;
11                    count++;
12                }
13            }
14        }
15    }
16    return count;
17}