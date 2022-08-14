package algorithm91.middleofthelinkedlist;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.middleofthelinkedlist
 * @ClassName: ListNode
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/8 07:12
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}