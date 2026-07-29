1class Solution {
2    public int maxProduct(int n) {
3        String str = Integer.toString(n);
4        int count = str.length();
5        int[] arr = new int[count];
6        int i=0;
7        while(n!=0){
8            int digit = n%10;
9            arr[i]=digit;
10            n=n/10;
11            i++;
12        }
13        Arrays.sort(arr);
14        return (arr[arr.length-1]*arr[arr.length-2]);
15    }
16}