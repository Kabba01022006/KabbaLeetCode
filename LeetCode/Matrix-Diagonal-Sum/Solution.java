1int diagonalSum(int** mat, int matSize, int* matColSize) {
2    int sum=0;
3    if(matSize==1){
4        sum += mat[0][0];
5    }
6    else if(matSize%2==0){
7        for(int i=0;i<matSize;i++){
8            for(int j=0;j<matSize;j++){
9                if(i==j){
10                    sum+=mat[i][j];
11                }
12                if(i+j==matSize-1){
13                    sum+=mat[i][j];
14                }
15            }
16        }
17    }
18    else if(matSize%2!=0){
19        for(int i=0;i<matSize;i++){
20            for(int j=0;j<matSize;j++){
21                if(i==j){
22                    sum+=mat[i][j];
23                }
24                if(i+j==matSize-1){
25                    sum+=mat[i][j];
26                }
27                
28            }
29        }
30        sum=sum-mat[(matSize/2)][(matSize/2)];
31    }
32    return sum;
33}
34
35