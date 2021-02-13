package com.zss.环形链表;



class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head == null){
           return null;
       }
       ListNode fast = head;
       ListNode slow = head;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow){
               break;
           }
       }
       if (fast == null || fast.next == null){
           return null;
       }
       slow = head;
       while(fast != slow){
           fast = fast.next;
           slow = slow.next;
       }
       return fast;
    }
}
