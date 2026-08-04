1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map = new HashMap<>();
4        for(int i=0;i<strs.length;i++){
5            char[] arr = strs[i].toCharArray();
6            Arrays.sort(arr);
7            String word = new String(arr);
8            if(!map.containsKey(word)){
9                List<String> list = new ArrayList<>();
10                list.add(strs[i]);
11                map.put(word,list);
12            }
13            else{
14                map.get(word).add(strs[i]);
15            }
16        }
17        List <List<String>> ans = new ArrayList<>();
18        for(List<String> elem : map.values()){
19            ans.add(elem);
20        }
21        return ans;
22    }
23}