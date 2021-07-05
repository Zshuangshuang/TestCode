package 链表的中间节点;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }


 }

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}