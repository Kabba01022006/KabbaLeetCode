1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        if(flowerbed.length==1 && n==0){
4            return true;
5        }
6        if(flowerbed.length==1 && n==1){
7            if(flowerbed[0]==0) return true;
8            else return false;
9        }
10        int count=n;
11        if(flowerbed[0]==0 && flowerbed[1]==0){
12            flowerbed[0]=1;
13            count--;
14        }
15        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
16            flowerbed[flowerbed.length-1]=1;
17            count--;
18        }
19        for(int i=1;i<flowerbed.length-1;i++){
20            if(flowerbed[i]!=1 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
21                flowerbed[i]=1;
22                count--;
23            }
24        }
25        if(count>0) return false;
26        else return true;
27    }
28}