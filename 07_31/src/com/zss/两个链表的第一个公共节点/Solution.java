package com.zss.两个链表的第一个公共节点;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }
        ListNode pl = pHead1;
        ListNode ps = pHead2;
        int lenA = 0;
        int lenB = 0;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = pHead1;
        ps = pHead2;
        int len = lenA - lenB;
        if (len < 0){
            len = lenB - lenA;
            pl = pHead2;
            ps = pHead1;
        }
        while (len > 0){
            pl = pl.next;
            len--;
        }
        while (pl != ps && pl != null && ps != null){
            pl = pl.next;
            ps = ps.next;
        }
        if (pl == pl){
            return pl;
        }
        return null;
    }
}