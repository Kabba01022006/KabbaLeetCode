1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length()-1;
5        int j = b.length()-1;
6        int carry=0;
7        int sum=0;
8        while(i>=0 || j>=0){
9            if(i<0 && j<0){
10                sum=carry;
11            }
12            else if(i<0 && j>=0){
13                sum=(b.charAt(j)-'0')+carry;
14            }
15            else if(i>=0 && j<0){
16                sum=(a.charAt(i)-'0')+carry;
17            }
18            else{
19                sum = (a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
20            }
21            if(sum==0){
22                sb.append("0");
23                carry=0;
24            }
25            else if(sum==1){
26                sb.append("1");
27                carry=0;
28            }
29            else if(sum==2){
30                sb.append("0");
31                carry=1;
32            }
33            else if(sum==3){
34                sb.append("1");
35                carry=1;
36            }
37            if(i>=0) i--;
38            if(j>=0) j--;
39        }
40        if(carry==1){
41            sb.append("1");
42        }
43        return sb.reverse().toString();
44    }
45}