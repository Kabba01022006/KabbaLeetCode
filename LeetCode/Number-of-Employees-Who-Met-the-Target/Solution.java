1int numberOfEmployeesWhoMetTarget(int* hours, int hoursSize, int target) {
2    int met=0;
3    for(int i=0;i<hoursSize;i++){
4        if(hours[i]>=target){
5            met++;
6        }
7    }
8    return met;
9}