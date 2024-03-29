package com.zss.算法题练习.合并两个排序链表;



class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                tmp.next = list1;
                list1 = list1.next;
            }else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if (list1 != null){
            tmp.next = list1;
        }
        if (list2 != null){
            tmp.next = list2;
        }
        return newHead.next;
    }
}