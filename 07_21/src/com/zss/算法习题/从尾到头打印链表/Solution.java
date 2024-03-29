package com.zss.算法习题.从尾到头打印链表;

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
        ArrayList<Integer> result = new ArrayList<>();
        if (listNode == null){
            return result;
        }
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            result.add(stack.pop().val);
        }
        return result;
    }
}