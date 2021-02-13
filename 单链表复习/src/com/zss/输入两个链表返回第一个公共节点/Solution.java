package com.zss.输入两个链表返回第一个公共节点;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      //判断参数的合法性
        if (headA == null || headB == null){
            return null;
        }
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        //求A的长度
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        //求B的长度
        while(ps != null){
            lenB++;
            ps = ps.next;
        }
        //求差值
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if(len < 0){
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        //先让len 走差值步
        while(len > 0){
            pl = pl.next;
            len--;
        }
        while (pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        if(pl != null && ps != null && pl == ps){
            return pl;
        }
        return  null;
    }
}
