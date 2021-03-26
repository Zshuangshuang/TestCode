package 复习.反转链表;
class  ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode ReverseList(ListNode head) {

        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = head;
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