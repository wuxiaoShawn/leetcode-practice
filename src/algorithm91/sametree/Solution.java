package algorithm91.sametree;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.sametree
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/28 20:36
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Input: p = [1,2], q = [1,null,2]
        if (p == null && q == null) return true;
        //if (p != null && q != null) return p.val == q.val;
        if ((p ==null && q != null) || (p !=null && q == null)) return false;
        if (p.val != q.val) return false;

        boolean boolLeft = isSameTree(p.left, q.left);
        boolean boolRight = isSameTree(p.right, q.right);

        return boolLeft && boolRight;


    }

}