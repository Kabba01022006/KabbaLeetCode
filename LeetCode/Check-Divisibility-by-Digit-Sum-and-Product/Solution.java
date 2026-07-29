1bool checkDivisibility(int n) {
2    int original_n= n;
3    int digit;
4    bool flag = false; //not divisible
5    int sumOfDigits=0;
6    int productOfDigits=1;
7    int sum;
8    while(n>0){
9        digit=n%10;
10        sumOfDigits+=digit;
11        productOfDigits*=digit;
12        n=n/10;
13    }
14    sum = sumOfDigits + productOfDigits ;
15    if(original_n%sum==0){
16        flag = true;
17    }
18    return flag;
19}