1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3
4        List<Integer> list = new ArrayList<>();
5        int rows = matrix.length;
6        int cols = matrix[0].length;
7
8        int[] minRow = new int[rows];
9        int[] maxCol = new int[cols];
10
11        //find all the min rowWise
12        for(int i=0;i<rows;i++){
13            int rowMin = Integer.MAX_VALUE;
14            for(int j=0;j<cols;j++){
15                rowMin = Math.min(rowMin,matrix[i][j]);
16            }
17            minRow[i]=rowMin;
18        }
19
20        //find all the max colWise
21        for(int j=0;j<cols;j++){
22            int colMax = Integer.MIN_VALUE;
23            for(int i=0;i<rows;i++){
24                colMax = Math.max(colMax,matrix[i][j]);
25            }
26            maxCol[j]=colMax;
27        }
28
29        //check if any num exists that is intersection 
30        for(int i=0;i<rows;i++){
31            for(int j=0;j<cols;j++){
32                if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]){
33                    list.add(matrix[i][j]);
34                }
35            }
36        }
37        return list;
38    }
39}