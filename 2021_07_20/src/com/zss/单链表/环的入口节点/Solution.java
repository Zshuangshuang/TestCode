package com.zss.单链表.环的入口节点;

import java.util.List;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        slow = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}