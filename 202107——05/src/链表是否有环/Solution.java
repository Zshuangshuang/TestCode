package 链表是否有环;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
       ListNode fast = head;
       ListNode slow = head;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow){
               break;
           }
       }
       if (fast == null || fast.next == null){
           return false;
       }
       return true;
    }
}