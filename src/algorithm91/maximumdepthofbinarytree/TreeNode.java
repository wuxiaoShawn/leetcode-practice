package algorithm91.maximumdepthofbinarytree;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.maximumdepthofbinarytree
 * @ClassName: TreeNode
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/27 08:11
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