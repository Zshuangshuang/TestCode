package com.zss.单链表.删除链表中重复的元素;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
       if (pHead == null){
           return null;
       }
       ListNode cur = pHead;
       ListNode newHead = new ListNode(-1);
       ListNode tmp = newHead;
       while (cur != null){
           if (cur.next != null && cur.val == cur.next.val){
               while (cur.next != null && cur.val == cur.next.val){
                   cur = cur.next;
               }
               cur = cur.next;
           }else {
               tmp.next = cur;
               cur = cur.next;
               tmp = tmp.next;
           }
       }
       tmp.next = null;
       return newHead.next;
    }
}