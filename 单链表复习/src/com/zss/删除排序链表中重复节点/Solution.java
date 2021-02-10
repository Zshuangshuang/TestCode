package com.zss.删除排序链表中重复节点;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
       //判断参数的合法性
        if (pHead == null){
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = pHead;
        while(cur != null){
            if ((cur.next != null) && (cur.val == cur.next.val)){
                while((cur.next != null) && (cur.val == cur.next.val)){
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

}
