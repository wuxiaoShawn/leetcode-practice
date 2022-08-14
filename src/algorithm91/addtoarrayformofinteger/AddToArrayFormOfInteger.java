package algorithm91.addtoarrayformofinteger;

import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91
 * @ClassName: AddToArrayFormOfInteger
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/15 19:12
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 * <p>
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 示例 2：
 * <p>
 * 输入：A = [2,7,4], K = 181
 * 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * 示例 3：
 * <p>
 * 输入：A = [2,1,5], K = 806
 * 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * 示例 4：
 * <p>
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果 A.length > 1，那么 A[0] != 0
 * <p>
 * 注意:
 * 1. 数字的位数可能比数组的长度大
 **/
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        int lastNum = k;
        int i = len - 1;
        LinkedList<Integer> result = new LinkedList<>();
        while (i >= 0 || lastNum > 0) {
            if (i >= 0)
                lastNum += num[i];
            //取模加入到数组
            result.addFirst(lastNum % 10);
            //更新最新值
            lastNum /= 10;
            i--;
        }
        return result;
    }
}