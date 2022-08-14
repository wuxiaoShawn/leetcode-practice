package algorithm91.convertsortedlisttobinarysearchtree;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.convertsortedlisttobinarysearchtree
 * @ClassName: TreeNode
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/23 23:14
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
