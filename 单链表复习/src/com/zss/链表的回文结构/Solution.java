package com.zss.链表的回文结构;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public boolean chkPalindrome(ListNode A) {
       if (A == null){
           return false;
       }
       //找到中间节点
        ListNode fast = A;
        ListNode slow = A;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转链表
        ListNode cur = slow.next;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //判断是否是回文
        while(A != slow){
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
