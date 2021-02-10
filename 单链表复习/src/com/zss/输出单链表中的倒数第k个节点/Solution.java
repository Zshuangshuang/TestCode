package com.zss.输出单链表中的倒数第k个节点;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
       if (head == null || k <= 0){
           return null;
       }
       ListNode fast = head;
       ListNode slow = head;
        while(k-1 > 0){
            if (fast.next != null){
                fast = fast.next;
                k--;
            }else {
                return null;
            }


        }
       while(fast.next != null){
           fast = fast.next;
           slow = slow.next;
       }
       return slow;
    }
}
