package problems.mergetwosortedlists;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.mergetwosortedlists
 * @ClassName: ListNode
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/2 22:50
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}