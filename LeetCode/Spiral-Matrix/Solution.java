1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> list = new ArrayList<>();
4
5        int top=0;
6        int left=0;
7        int bottom=matrix.length-1;
8        int right=matrix[0].length-1;
9
10        while(top<=bottom && left<=right){
11            //go left to right
12            for(int i=left;i<=right;i++){
13                list.add(matrix[top][i]);
14            }
15            top++;
16
17            //go top to bottom
18            for(int i=top;i<=bottom;i++){
19                list.add(matrix[i][right]);
20            }
21            right--;
22
23            //go right to left
24            if(top<=bottom){
25            for(int i=right;i>=left;i--){
26                list.add(matrix[bottom][i]);
27                    }
28            bottom--;
29            }
30            
31            //go bottom to top
32            if(left<=right){
33                for(int i=bottom;i>=top;i--){
34                list.add(matrix[i][left]);
35                    }
36            left++;
37            }
38        } 
39        return list;
40    }
41}
42    
43