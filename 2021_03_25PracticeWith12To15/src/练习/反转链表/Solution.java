package 练习.反转链表;

import java.util.List;

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {
       //判断参数的合法性
        if (head == null){
            return null;
        }
        ListNode newHead = null;//表示新的头结点
        ListNode prev = null;//表示当前节点的前驱节点
        ListNode cur = head;//表示当前节点
        while (cur != null){
            ListNode curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}