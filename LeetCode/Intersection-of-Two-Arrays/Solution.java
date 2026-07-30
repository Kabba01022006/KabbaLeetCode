1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        ArrayList<Integer> list = new ArrayList<>();
4        Arrays.sort(nums1);
5        Arrays.sort(nums2);
6        int len1 = nums1.length;
7        int len2 = nums2.length;
8        int i=0;
9        int j=0;
10        int lastElem=-1;
11        while(i<len1 && j<len2){
12            if(nums1[i]!=nums2[j]){
13                if(nums1[i]<nums2[j]) i++;
14                else j++;
15            }
16            else if(nums1[i]==nums2[j] && lastElem != nums1[i]){
17                lastElem=nums1[i];
18                list.add(nums1[i]);
19                i++;
20                j++;
21            }
22            else{
23                i++;
24                j++;
25            }
26        }
27        int[] arr = new int[list.size()];
28        for(i=0;i<arr.length;i++){
29            arr[i]=list.get(i);
30        }
31        return arr;
32    }
33}