# 1. Two Sum
**Thinking:**
> 如何找到target - x的值
 1. 暴力解法
     * 枚举每个x是否存在与之对应的target -x
     * x 一层遍历
     * target - x 一层遍历 总时间复杂度O(n2)
 2. 将target - x的O(n) 操作通过哈希表变为O(1)操作
    * 以空间换时间
    

```java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1. 暴力 双层遍历
        //int l = nums.length;
        //for (int i = 0; i < l; ++i) {
        //    for (int j = i + 1; j < l; ++j) {
        //        if (nums[i] + nums[j] == target) {
        //            return new int[]{i, j};
        //        }
        //    }
        //}
        //return new int[0];
        //2. hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
```
> Time  Complexity O(n)
> Space Complexity O(n)