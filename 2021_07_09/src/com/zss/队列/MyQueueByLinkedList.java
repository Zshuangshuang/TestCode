package com.zss.队列;


public class MyQueueByLinkedList {
    static class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node head = null;
        public Node tail = null;
        public void offer(int val){
            Node node = new Node(val);
            if (head == null){
                head = node;
                tail = node;
            }
            tail.next = node;
            tail = tail.next;
        }
        public Integer poll(){
            if (head == null){
                return null;
            }
            int ret = head.val;
            head = head.next;
            return ret;
        }
        public Integer peek(){
            if (head == null){
                return null;
            }
            return head.val;
        }
    }
    public static void main(String[] args) {

    }
}
