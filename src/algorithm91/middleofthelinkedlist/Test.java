package algorithm91.middleofthelinkedlist;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.middleofthelinkedlist
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/8 07:33
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    //[1,2,3,4,5,6]
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode listNode = new Solution().middleNode(l1);
        System.out.println(listNode.val);
    }
}