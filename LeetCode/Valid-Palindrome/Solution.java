1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder str = new StringBuilder();
4        for(int i=0;i<s.length();i++){
5            if(Character.isLetterOrDigit(s.charAt(i))){
6                str.append(Character.toLowerCase(s.charAt(i)));
7            }
8        }
9        int left=0;
10        int right=str.length()-1;
11        while(left<right){
12            if(str.charAt(left)!=str.charAt(right)) return false;
13            left++;
14            right--;
15        }
16        return true;
17    }
18}