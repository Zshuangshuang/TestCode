package com.zss.单链表.反转链表;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;
        while (cur != null){
            ListNode curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}