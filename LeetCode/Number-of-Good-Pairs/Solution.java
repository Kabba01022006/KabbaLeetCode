1int numIdenticalPairs(int* nums, int numsSize) {
2    int count = 0;
3    for(int i=0 ; i<numsSize; i++){
4        for(int j=i+1 ;  j<numsSize ; j++){
5            if(nums[i] == nums[j]){
6                count++;
7            }
8        }
9    }
10    return count;
11}