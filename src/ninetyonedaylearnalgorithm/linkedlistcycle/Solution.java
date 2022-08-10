package ninetyonedaylearnalgorithm.linkedlistcycle;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.linkedlistcycle
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/25 21:00
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 * 1. 快指针比慢指针快一格,且有环的情况下,快慢指针一定会相遇
 * 2. 三变量
 * > 1. x = 链表头到环入口的距离
 * > 2. y = 环入口到相遇的距离
 * > 3. z = 相遇到环入口的距离
 * slow = x + y
 * fast = x + n(y + z) +y
 * 2slow = fast
 * 2(x + y) = x + n(y + z) +y
 * x + y = n(y + z)
 * x = n(y + z) -y
 * x = (n - 1)(y + z) + z
 * (n - 1)(y + z)相当于不断在转圈
 **/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //设快慢指针
        ListNode fast = head;
        ListNode slow = head;
        //退出循环,两步两步跳,注意next也不为空
        while ((fast != null && fast.next != null) ){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode index1 = head;
                ListNode index2 = fast;
                while (index1 != index2){
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }


        return null;

    }
}
