package com.zss.单链表.链表是否有环;
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
       if (head == null){
           return false;
       }
       ListNode fast = head;
       ListNode slow = head;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow){
               return true;
           }
       }
       return false;
    }
}