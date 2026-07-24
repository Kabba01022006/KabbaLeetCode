1class Solution {
2    public int calPoints(String[] operations) {
3        ArrayList<Integer> list = new ArrayList<>();
4        int i=0;
5        while(i<operations.length){
6            if(!(operations[i].equals("C"))&&
7               !(operations[i].equals("+"))&&
8               !(operations[i].equals("D"))){
9                list.add(Integer.parseInt(operations[i]));
10                i++;
11            }
12            else if(operations[i].equals("C")){
13                list.remove(list.size()-1);
14                i++;
15            }
16            else if(operations[i].equals("D")){
17                list.add(2*(list.get(list.size()-1)));
18                i++;
19            }
20            else if(operations[i].equals("+")){
21                list.add(list.get(list.size()-1)+list.get(list.size()-2));
22                i++;
23            }
24        }
25        int sum=0;
26        for(i=0;i<list.size();i++){
27            sum+=list.get(i);
28        }
29        return sum;
30    }
31}