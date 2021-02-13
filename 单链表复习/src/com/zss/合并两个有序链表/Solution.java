package com.zss.合并两个有序链表;


class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while(l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

            while(l2 != null){
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }


            while(l1 != null){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
        return newHead.next;

    }
}
