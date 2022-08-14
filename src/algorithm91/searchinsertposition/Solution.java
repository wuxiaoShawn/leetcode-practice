package algorithm91.searchinsertposition;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.searchinsertposition
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/10 22:36
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
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