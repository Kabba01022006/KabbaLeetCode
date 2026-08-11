1class Solution {
2    public int lengthOfLastWord(String s) {
3        char[] arr = s.toCharArray();
4        int n=arr.length;
5        int letterCount=0;
6        int spaceCount=0;
7        int i=n-1;
8        if(arr[n-1]!=' '){
9            while(i>=0 && arr[i]!=' '){
10                letterCount++;
11                i--;
12            }
13            return letterCount;
14        }
15        i=n-1;
16        if(arr[n-1]==' '){
17            while(i>=0 && arr[i]==' '){
18                spaceCount++;
19                i--;
20            }
21        }
22        i=n-1-spaceCount;
23        while(i>=0 && arr[i]!=' '){
24            letterCount++;
25            i--;
26        }
27        return letterCount;
28    }
29}