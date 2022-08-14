# 876. Middle of the Linked List
**Thinking:**
1. 快慢指针

```java
public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        if (head.next.next == null) return head.next;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

}
```
> Time  Complexity O(n)
> Space Complexity O(1)