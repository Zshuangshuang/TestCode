import java.util.*;

 class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
      this.val = val;
   }
 }


public class Solution4 {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(pHead == null || k  <= 0){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        for (int i = 0; i < k-1; i++) {
            if (fast.next != null){
                fast = fast.next;
            }else {
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}