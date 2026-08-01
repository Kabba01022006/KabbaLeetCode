1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int carry=0;
5        int sum=0;
6        int i=a.length()-1;
7        int j=b.length()-1;
8        while(i>=0 || j>=0){
9            sum = carry;
10            if(i>=0){
11                sum=sum+(a.charAt(i)-'0');
12                i--;
13            }
14            if(j>=0){
15                sum=sum+(b.charAt(j)-'0');
16                j--;
17            }
18            sb.append(sum%2);
19            carry=sum/2;
20        }
21        if(carry==1) sb.append("1");
22        return sb.reverse().toString();
23    }
24}