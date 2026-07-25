1int maxProduct(int n) {
2    int count=0;
3    int temp = n;
4    int digit;
5    while(temp>0){
6        digit=temp%10;
7        count++;
8        temp=temp/10;
9    }
10    temp = n;
11    int arr[count];
12    for(int i=count-1;i>=0;i--){
13        digit=temp%10;
14        arr[i]=digit;
15        temp=temp/10;
16    }
17    int curPro;
18    int maxPro=0;
19    for(int i=0;i<count;i++){
20        for(int j=i+1;j<count;j++){
21            curPro=arr[i]*arr[j];
22            if(curPro>maxPro){
23                maxPro=curPro;
24            }
25        }
26    }
27    return maxPro;   
28}