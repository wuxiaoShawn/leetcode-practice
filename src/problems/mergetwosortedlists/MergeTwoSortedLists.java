package problems.mergetwosortedlists;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.mergetwosortedlists
 * @ClassName: MergeTwoSortedLists
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/2 22:42
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode res = l1.val < l2.val ? l1 : l2;
        res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        return res;
    }

}