1int singleNumber(int* nums, int numsSize) {
2    if (numsSize == 1) {
3        return nums[0];
4    }
5
6    int temp;
7    for (int i = 0; i < numsSize - 1; i++) {
8        for (int j = i + 1; j < numsSize; j++) {
9            if (nums[i] > nums[j]) {
10                temp = nums[i];
11                nums[i] = nums[j];
12                nums[j] = temp;
13            }
14        }
15    }
16
17    for (int i = 0; i < numsSize - 1; i += 2) {
18        if (nums[i] != nums[i + 1]) {
19            return nums[i];
20        }
21    }
22
23    return nums[numsSize - 1];
24}