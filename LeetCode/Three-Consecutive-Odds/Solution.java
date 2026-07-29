1bool threeConsecutiveOdds(int* arr, int arrSize) {
2    bool areOdds = false ;
3    for(int i=0;i<arrSize-2;i++){
4        if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
5            areOdds = true;
6        }
7    }
8    return areOdds;
9}