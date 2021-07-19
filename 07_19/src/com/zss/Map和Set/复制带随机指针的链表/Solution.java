package com.zss.Map和Set.复制带随机指针的链表;

import java.util.HashMap;
import java.util.Map;

class Node{
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
    }
}
class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next){
            map.put(cur,new Node(cur.val));
        }
        for (Node cur = head; cur != null; cur = cur.next){
            Node newCur = map.get(cur);
            newCur.next = map.get(cur.next);
            newCur.random = map.get(cur.random);
        }
        return map.get(head);
    }
}