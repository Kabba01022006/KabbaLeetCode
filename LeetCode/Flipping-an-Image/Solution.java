1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int i=0;i<image.length;i++){
4            int left=0;
5            int right=image[0].length-1;
6            while(left<right){
7                int temp = image[i][left];
8                image[i][left] = image[i][right];
9                image[i][right] = temp;
10                left++;
11                right--;
12            }
13            for(int j=0;j<image[0].length;j++){
14                if(image[i][j]==0) image[i][j]=1;
15                else image[i][j] = 0;
16            }
17        }
18        return image;
19    }
20}