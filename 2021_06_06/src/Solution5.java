public class Solution5 {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode newHead = null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }
}