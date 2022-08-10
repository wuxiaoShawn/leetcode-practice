# 1590. Make Sum Divisible by P
**Thinking:**
 1. allSum % p = rangeSum % p
 2. rangeSum = preSum2 - preSum1
 3. 找出与allSum相同的rangeSum的mod值
 4. rangeSum % p = mod
 5. preSum1 % p = curMod
 6. targetMod = mod - curMod
 7. 注意大数

```java
public class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> table = new HashMap<>();
        long allSum = 0;
        for (int i = 0; i < nums.length; i++) {
            //求allSum
            allSum += nums[i];
        }
        //求mod
        int mod = (int)(allSum % p);
        if (mod == 0) return 0;

        table.put(0, -1);
        int res = nums.length;
        long preSum = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            //求curMod
            int curMod = (int)(preSum % p);

            //求targetMod 负数做处理
            int targetMod = (curMod - mod + p ) % p;
            if (table.containsKey(targetMod)) {
                res = Math.min(i - table.get(targetMod), res);
            }
            table.put(curMod, i);
        }
        return res == nums.length ? -1 : res;
    }

}
```
> Time  Complexity O(n)
> Space Complexity O(n)