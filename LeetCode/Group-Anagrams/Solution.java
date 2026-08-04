1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        String[] newArr = new String[strs.length];
4        for(int i=0;i<strs.length;i++){
5            char[] arr = strs[i].toCharArray();
6            Arrays.sort(arr);
7            newArr[i] = new String(arr);
8        }
9        HashMap<String,List<String>> map = new HashMap<>();
10        for(int i=0;i<newArr.length;i++){
11            if(!map.containsKey(newArr[i])){
12                List<String> list = new ArrayList<>();
13                list.add(strs[i]);
14                map.put(newArr[i],list);
15            }
16            else{
17                map.get(newArr[i]).add(strs[i]);
18            }
19        }
20        List<List<String>> ans = new ArrayList<>(map.values());
21        return ans;
22    }
23}