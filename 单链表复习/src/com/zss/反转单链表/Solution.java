package com.zss.反转单链表;




class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode cur = head;
       ListNode prev = null;
       ListNode newHead = null;
       while(cur != null){
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
