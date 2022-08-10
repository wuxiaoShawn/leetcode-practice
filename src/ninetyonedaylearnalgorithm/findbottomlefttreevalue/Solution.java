package ninetyonedaylearnalgorithm.findbottomlefttreevalue;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.findbottomlefttreevalue
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/30 21:37
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 * dfs
 * 1. 维护curHeight curVal
 * 2. 终止条件 当前节点为null
 * 3. 优先当前节点的左子节点，只有当height高于curHeight维护curVal及curHeight
 **/
public class Solution {
    int curVal, curHeight= Integer.MIN_VALUE;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return curVal;
    }

    private void dfs(TreeNode root, int height) {
        if (root == null) return;
        if (height > curHeight) {
            curHeight = height;
            curVal = root.val;
        }
        height++;
        dfs(root.left, height);
        dfs(root.right, height);
    }
}