package algorithm91.removeduplicatesfromsortedarray;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.removeduplicatesfromsortedarray
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/9 22:45
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
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