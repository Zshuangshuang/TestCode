package 两个链表的第一个公共节点;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
       //判断参数的合法性
        if (pHead1 == null || pHead2 == null){
            return null;
        }
        //计算两个链表的长度差
        ListNode pl = pHead1;
        ListNode ps = pHead2;
        int lenA = 0;
        int lenB = 0;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        int len = lenA-lenB;
        pl = pHead1;
        ps = pHead2;
        if (len < 0){
            pl = pHead2;
            ps = pHead1;
            len = lenB-lenA;
        }
        //让长的链表先走差值步
        while (len > 0){
            pl = pl.next;
            len--;
        }
        while (pl != ps){
            pl = pl.next;
            ps = ps.next;
        }
        if (pl != null && ps != null && pl == ps){
            return pl;
        }
        return null;
    }
}
