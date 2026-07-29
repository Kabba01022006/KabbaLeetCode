1int arraySign(int* nums, int numsSize) {
2    int returnVal;
3    int positiveCount=0;
4    int negativeCount=0;
5    int zeroCount=0;
6    for(int i=0;i<numsSize;i++){
7        if(nums[i]==0){
8            zeroCount++;
9        }
10        else if(nums[i]<0){
11            negativeCount++;
12        }
13        else if(nums[i]>0){
14            positiveCount++;
15        }
16    }
17    if(zeroCount>0){
18        returnVal=0;
19    }
20    else if((positiveCount==0) || (negativeCount>0 && negativeCount%2!=0)){
21        returnVal=-1;
22    }
23    else if((negativeCount==0) || (negativeCount>0 && negativeCount%2==0)){
24        returnVal=1;
25    }
26    
27    return returnVal;
28}