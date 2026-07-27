1class Solution {
2    public int[] decimalRepresentation(int n) {
3        ArrayList<Integer> list = new ArrayList<>();
4        int mul=1;
5        while(n!=0){
6            int dig = n%10;
7            dig=dig*mul;
8            mul*=10;
9            if(dig!=0){
10                list.add(dig);
11            }
12            n=n/10;
13        }
14        int[] arr = new int[list.size()];
15        for(int i=0;i<list.size();i++){
16            arr[i]=list.get(i);
17        }
18        int i=0;
19        int j=arr.length-1;
20        while(i<j){
21            int temp=arr[i];
22            arr[i]=arr[j];
23            arr[j]=temp;
24            i++;
25            j--;
26        }
27        return arr;
28    }
29}
30