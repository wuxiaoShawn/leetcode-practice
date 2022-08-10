package ninetyonedaylearnalgorithm.findbottomlefttreevalue;

import java.util.ArrayDeque;
import java.util.Queue;

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
class Solution1 {
    public int findBottomLeftValue(TreeNode root) {
        int ret = 0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            if (p.right != null) {
                queue.offer(p.right);
            }
            if (p.left != null) {
                queue.offer(p.left);
            }
            ret = p.val;
        }
        return ret;
    }
}

