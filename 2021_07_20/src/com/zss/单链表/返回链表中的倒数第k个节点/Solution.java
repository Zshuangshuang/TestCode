package com.zss.单链表.返回链表中的倒数第k个节点;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if (pHead == null || k <= 0){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (k-1 > 0){
            if (fast.next != null){
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}