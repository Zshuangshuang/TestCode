package 练习.返回链表中的倒数第k个节点;
import java.util.*;
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
        //先让fast走k-1步,如果在走k-1步还没有走完的时候，fast.next已经为空，则说明k已经超出了这个单链表的长度
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