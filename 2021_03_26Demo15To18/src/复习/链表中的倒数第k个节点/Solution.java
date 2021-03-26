package 复习.链表中的倒数第k个节点;



class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {

    public ListNode FindKthToTail (ListNode pHead, int k) {
        //判断参数的合法性
        if (pHead == null || k <= 0){
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