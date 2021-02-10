package com.zss.链表分割;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null){
            return null;
        }
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae  = null;
        ListNode cur = pHead;
        while(cur != null){
            if (cur.val < x){
                if (bs == null){
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null){
                    as = cur;
                    ae = as;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }

            }
            cur = cur.next;
        }
        if (bs == null){
            return as;
        }
        be.next = as;
        if (as != null){
            ae.next = null;
        }
        return  bs;
    }
}
