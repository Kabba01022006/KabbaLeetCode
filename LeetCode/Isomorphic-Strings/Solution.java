1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        HashMap<Character,Character> map = new HashMap<>();
5        for(int i=0;i<s.length();i++){
6            if(map.containsKey(s.charAt(i))){
7                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
8                
9            }
10            else{
11                if(map.containsValue(t.charAt(i))==true) return false;
12                map.put(s.charAt(i),t.charAt(i));
13            }
14        }
15        return true;
16    }
17}