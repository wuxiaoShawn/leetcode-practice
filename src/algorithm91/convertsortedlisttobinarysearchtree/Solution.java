package algorithm91.convertsortedlisttobinarysearchtree;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.convertsortedlisttobinarysearchtree
 * @ClassName: ConvertSortedListToBinarySearchTree
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/23 23:13
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    //二分法，快慢指针
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode fast = head, slow = head, pre = null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        //分割root节点和左右链表
        pre.next = null;
        ListNode rightList = slow.next;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(rightList);
        return root;
    }
}