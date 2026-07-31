1class Solution {
2    public int numUniqueEmails(String[] emails) {
3        HashSet<String> set = new HashSet<>();
4        for(int i=0;i<emails.length;i++){
5            StringBuilder sb = new StringBuilder(emails[i]);
6            int j=0;
7            boolean occured=false;
8            while(sb.charAt(j)!='@'){
9                if(sb.charAt(j)=='+'){
10                    occured=true;
11                    sb.deleteCharAt(j);
12                }
13                else if(sb.charAt(j)>=97 && sb.charAt(j)<=122 && occured==false){
14                    j++;
15                }
16                else if(sb.charAt(j)>=97 && sb.charAt(j)<=122 && occured==true){
17                    sb.deleteCharAt(j);
18                }
19                else if(sb.charAt(j)=='.'){
20                    sb.deleteCharAt(j);
21                }
22                else{
23                    j++;
24                }
25            }
26            set.add(sb.toString());
27        }
28        return set.size();
29    }
30}