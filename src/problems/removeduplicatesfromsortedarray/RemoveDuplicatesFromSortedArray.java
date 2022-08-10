package problems.removeduplicatesfromsortedarray;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.removeduplicatesfromsortedarray
 * @ClassName: RemoveDuplicatesFromSortedArray
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/8 23:54
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // 使用双指针
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

}