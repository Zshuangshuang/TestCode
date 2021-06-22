import java.util.HashMap;
import java.util.Map;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        //判断参数的合法性
        if (pHead == null){
            return null;
        }
        //定义一个虚拟的新节点，保存复制后的链表的头
        RandomListNode randomHead = new RandomListNode(pHead.label);
        RandomListNode tmp = randomHead;
        RandomListNode cur = pHead;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        while (pHead != null){
            map.put(pHead,new RandomListNode(pHead.label));
            pHead = pHead.next;
        }
        while (cur != null){
            tmp.next = map.get(cur.next);
            tmp.random = map.get(cur.random);
            cur = cur.next;
            tmp = tmp.next;
        }
        return randomHead;
    }
}