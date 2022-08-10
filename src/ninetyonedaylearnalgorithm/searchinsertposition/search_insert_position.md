# 35. Search Insert Position
**Thinking:**
1. 二分

```java
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

}
```
> Time  Complexity O(logn)
> Space Complexity O(1)