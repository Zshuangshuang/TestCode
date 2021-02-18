package com.zss.从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

class ListNode{
  public int val;
  public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList();
        if (listNode == null){
            return list;
        }
        Stack stack = new Stack();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}
