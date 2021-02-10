package com.zss.删除链表中重复的元素;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode deleteDuplicates(ListNode head,int val) {
       //判断参数的合法性
        if (head == null){
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;//代表当前要删除的节点
        while(cur != null){
            if (cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == val){
            head = head.next;
        }
        return head;
    }
}
