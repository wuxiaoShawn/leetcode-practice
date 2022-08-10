package ninetyonedaylearnalgorithm.linkedlistcycle;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.linkedlistcycle
 * @ClassName: Tset
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/25 22:14
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l0 = new ListNode(3);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(-4);
        l0.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l1;

        System.out.println(solution.detectCycle(l0).val);;
    }

}