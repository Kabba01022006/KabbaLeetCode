1bool isSameAfterReversals(int num) {
2    bool flag = false;
3    int rem;
4    int reversed1=0;
5    int temp1 = num;
6    while(temp1!=0){
7        rem=temp1%10;
8        reversed1=(reversed1*10)+(rem);
9        temp1=temp1/10;
10    }
11    int temp2 = reversed1;
12    int reversed2=0;
13    while(temp2!=0){
14        rem=temp2%10;
15        reversed2=(reversed2*10)+(rem);
16        temp2=temp2/10;
17    }
18    if(num == reversed2){
19        flag = true;
20    }
21    else{
22        flag = false;
23    }
24    return flag;
25}