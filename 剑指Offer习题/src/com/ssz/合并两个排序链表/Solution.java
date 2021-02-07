package com.ssz.合并两个排序链表;


public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode newHead = null;
        if (list1.val <= list2.val){
            newHead = list1;
            list1.next = Merge(list1.next,list2);
        }else {
            newHead = list2;
            list2.next = Merge(list1,list2.next);
        }
        return newHead;
    }
}