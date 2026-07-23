1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        ArrayList<Integer> list = new ArrayList<>();
4        Arrays.sort(nums1);
5        Arrays.sort(nums2);
6        int len1 = nums1.length;
7        int len2 = nums2.length;
8        int i=0;
9        int j=0;
10        while(i<len1 && j<len2){
11            if(nums1[i]!=nums2[j]){
12                if(nums1[i]<nums2[j]) i++;
13                else j++;
14            }
15            else{
16                list.add(nums1[i]);
17                i++;
18                j++;
19            }
20        }
21        int[] ans = new int[list.size()];
22        for(int k=0;k<list.size();k++){
23            ans[k]=list.get(k);
24        }
25        return ans;
26    }
27}