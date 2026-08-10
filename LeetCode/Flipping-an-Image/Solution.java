1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int i=0;i<image.length;i++){
4            int left=0;
5            int right=image[0].length-1;
6            while(left<=right){ //because we want to invert the middle element too in case of odd
7                int temp = 1-image[i][left];
8                image[i][left] = 1-image[i][right];
9                image[i][right] = temp;
10                left++;
11                right--;
12            }
13        }
14        return image;
15    }
16}