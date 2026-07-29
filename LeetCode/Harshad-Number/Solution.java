1int sumOfTheDigitsOfHarshadNumber(int x) {
2    int returnVal = -1;
3    int sum=0;
4    int temp = x;
5    int digit;
6    while(temp!=0){
7        digit=temp%10;
8        sum+=digit;
9        temp=temp/10;
10    }
11    if(x%sum==0){
12        returnVal = sum;
13    }
14    return returnVal;
15}