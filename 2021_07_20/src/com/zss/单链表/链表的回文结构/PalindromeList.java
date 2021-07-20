package com.zss.单链表.链表的回文结构;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        // write code here
        if (A == null){
            return false;
        }
        ListNode fast = A;
        ListNode slow = A;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while (A != slow){
            if (A.val != slow.val){
                return false;
            }
            if (A.next == slow){
                return true;
            }
            A = A.next;
            slow = slow.next;
        }
        return true;
    }
}