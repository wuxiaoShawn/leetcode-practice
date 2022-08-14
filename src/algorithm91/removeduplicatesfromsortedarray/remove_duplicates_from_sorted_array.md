# 26. Remove Duplicates from Sorted Array
**Thinking:**
1. 双指针


```java
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i]){

            }else {
                nums[j+1] = nums[i];

                j++;
            }
        }
        return j + 1;
    }

}
```
> Time  Complexity O(n)
> Space Complexity O(1)