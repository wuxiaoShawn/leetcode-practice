package algorithm91.verticalordertraversalofabinarytree1;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.verticalordertraversalofabinarytree
 * @ClassName: TreeNode
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/2 22:44
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