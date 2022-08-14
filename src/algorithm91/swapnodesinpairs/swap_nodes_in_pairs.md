# 24. Swap Nodes in Pairs
**Thinking:**
1. 递归
2. 虚拟头节点

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null){
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = cur;

            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
```
> Time  Complexity O(n)
> Space Complexity O(1)