1class Solution {
2    public int singleNumber(int[] nums) {
3        //can be done easily using hashMap too
4        HashSet<Integer> set = new HashSet<>();
5        //what we do is if the element already exists we remove it ,if not we dont remove it ,so there will only left one single element in our array, that element will be our ans
6        for(int ele:nums){
7            if(set.contains(ele)){
8                set.remove(ele);
9            }
10            else{
11                set.add(ele);
12            }
13        }
14        for(int ele:set){
15            return ele;
16        }
17        return -1; //our java compiler requires a return statement, as it thinks what if the set dont have any element, even though our questions clearly says that there exists one element that is unique but its a java compiler thing so we have to use a return statmenet.
18    }
19}