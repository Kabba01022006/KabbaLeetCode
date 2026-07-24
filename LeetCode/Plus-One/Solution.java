1import java.util.ArrayList;
2import java.util.Collections;
3
4class Solution {
5    public int[] plusOne(int[] digits) {
6        ArrayList<Integer> arr = new ArrayList<>();
7        int carry = 1;
8        for(int i=digits.length-1;i>=0;i--){
9            if(digits[i]+carry<=9){
10                arr.add(digits[i]+carry);
11                carry=0;
12            }
13            else{
14                arr.add(0);
15                carry=1;
16            }
17        }
18        if(carry==1){
19            arr.add(1);
20        }
21        Collections.reverse(arr);
22        int n = arr.size();
23        int[] ans= new int[n];
24        for(int i=0;i<n;i++){
25            ans[i] = arr.get(i);
26        }
27        return ans;
28    }
29}