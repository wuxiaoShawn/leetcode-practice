# 109. Convert Sorted List to Binary Search Tree
**Thinking:**
1. 二分法，快慢指针

```java
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
```
> Time  Complexity O(n)
> Space Complexity O(1)