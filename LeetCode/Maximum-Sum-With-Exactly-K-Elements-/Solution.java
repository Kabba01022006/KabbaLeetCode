1int maximizeSum(int* nums, int numsSize, int k) {
2    int maxVal=nums[0];
3    int score=0;
4    for(int i=0;i<numsSize;i++){
5        if(nums[i]>maxVal){
6            maxVal=nums[i];
7        }
8    }
9    while(k>0){
10        score+=maxVal;
11        maxVal++;
12        k--;
13    }
14    return score;
15}