package com.zss.算法题.复杂链表的复制;

import java.util.HashMap;
import java.util.Map;

class RandomListNode{
   public int label;
   public RandomListNode next = null;
   public RandomListNode random = null;
   public RandomListNode(int label) {
        this.label = label;
    }
}
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null){
            return null;
        }
        RandomListNode newHead = new RandomListNode(pHead.label);
        RandomListNode tmp = newHead;
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
        return newHead;
    }
}