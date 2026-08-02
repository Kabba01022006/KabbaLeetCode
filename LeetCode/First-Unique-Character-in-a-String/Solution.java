1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            if(map.containsKey(s.charAt(i))){
6                map.put(s.charAt(i),map.get(s.charAt(i))+1);
7            }
8            else{
9                map.put(s.charAt(i),1);
10            }
11        }
12        for(int i=0;i<s.length();i++){
13            if(map.get(s.charAt(i))==1) return i;
14        }
15        return -1;
16    }
17}