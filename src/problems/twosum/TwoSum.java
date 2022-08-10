package problems.twosum;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.twosum1
 * @ClassName: TwoSum
 * @Description: []
 * @Author: [Shawn Wu]
 * @Date: 2022/6/26 23:15
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 注意, 本文件Shawn Wu 所作,如果转载或使用请标明具体出处!
 **/
public class TwoSum {
    /**
     * 最暴力的做法，明日回顾更好的解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length - 1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}