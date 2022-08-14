package algorithm91.swapnodesinpairs;

import problems.mergetwosortedlists.ListNode;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.swapnodesinpairs
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/22 21:36
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    public ListNode swapPairs(ListNode head) {
        //1->2->3->4
        ListNode dummy = new ListNode(0);
        //添加虚拟头节点方便处理第一个节点的数据
        //0->1->2->3->4
        dummy.next = head;
        ListNode pre = dummy;
        //围绕cur处理,但不修改cur的值,使用pre.next来修改,这样可以一直保存cur及其cur.next的值,pre同样道理,这样在最后一起更新pre与cur的值带入下一个循环
        ListNode cur = head;
        while (cur !=null && cur.next !=null){
            //0->2
            pre.next = cur.next;
            //0->2->3
            cur.next = cur.next.next;
            //0->2->1 完成互换
            pre.next.next = cur;
            //更新pre与cur的值
            pre = cur;
            cur = cur.next;
        }

        return dummy.next;

    }
    public ListNode swapPairsRecursion(ListNode head) {
        /**
         * 递归处理
         * 1. 找到终止条件，最小规模事件的值，比如i == 0或者object == null时
         * 2. 找返回值,返回不符合终止条件，已经被处理的链表。
         * 3. 找小规模事件处理方法
         * 终止条件,返回值和处理方法是关联的,通过终止条件找到返回值类型，
         * 比如最小规模的事件head为头的链表长度为1，那么就会返回head，如果长度为2，那么就是小规模事件，先处理最小规模事件，返回值返回到上层后，通过处理方法处理，给出最终值
         * 如果长度为n就是一般事件，不断返回返回值到上层给处理方法处理，最终给出最终值
         */
        if (head ==null || head.next ==null) return head;
        //cur是当前值 next是相邻可以互换的值。next.next是小规模事件条件，不断递归，最终成为长度为1的链表的头
        ListNode cur = head;
        ListNode next = cur.next;
        //不断返回已经被处理方法处理过的完成swap的链表
        //处理方法 对应算法的要求
        //1->2->3->4->5->6
        //   1   ->       4->3->6->5
        cur.next = swapPairsRecursion(next.next);
        //  2     -> 1
        next.next = cur;



        return next;

    }

}