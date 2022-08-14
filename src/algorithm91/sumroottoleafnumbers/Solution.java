package algorithm91.sumroottoleafnumbers;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.sumroottoleafnumbers
 * @ClassName: SumRootToLeafNumbers
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/29 22:02
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    private int dfs(TreeNode root, int prevNum){
        if (root == null) return 0;
        int sum = prevNum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        return dfs(root.left,sum) + dfs(root.right,sum);
    }

}