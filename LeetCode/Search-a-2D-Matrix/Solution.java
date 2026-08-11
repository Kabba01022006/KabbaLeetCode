1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int low=0;
6        int high=(rows*cols)-1;
7        while(low<=high){
8            int mid = low+(high-low)/2;
9            int midRow=mid/cols;
10            int midCol=mid%cols;
11            if(matrix[midRow][midCol]==target) return true;
12            else if(matrix[midRow][midCol]>target){
13                high=mid-1;
14            }
15            else{
16                low=mid+1;
17            }
18        }
19        return false;
20    }
21}