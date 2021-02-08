class Node{
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next =null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
        this.head = null;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if (head == null){
            this.head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    public Node findPos(int pos){
        Node prev = this.head;
        int ret = pos-1;
        while(ret > 0){
            prev = prev.getNext();
            ret -- ;
        }
        return prev;
    }
    public void addIndex(int pos,int data){
        if (pos < 0 || pos > size()){
            return;
        }
        Node node = new Node(data);
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node prev = findPos(pos);
        node.setNext(prev.getNext());
        prev.setNext(node);
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.getData()+" ");
            cur = cur.getNext();
        }
    }
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    public boolean containsKey(int toFind){
        if (this.head == null){
            return false;
        }
        Node cur = this.head;
        while(cur != null){
            if (cur.getData() == toFind){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    public Node findPrev(int data){
       Node cur = this.head;
       while(cur.getNext() != null){
           if (cur.getNext().getData() == data){
               return cur;
           }
           cur = cur.getNext();
       }
       return null;
    }
    public void remove(int data){
        if (this.head.getData() == data){
            this.head = this.head.getNext();
            return;
        }
        Node prev = findPrev(data);
        if (prev == null){
            System.out.println("没有当前节点");
            return;
        }
        Node toDel = prev.getNext();
        prev.setNext(toDel.getNext());
    }
    public void clear(){

    }
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addFirst(99);
        linkedList.display();
        System.out.println();
        /*System.out.println(linkedList.containsKey(99));
        System.out.println(linkedList.size());*/
        linkedList.addIndex(3,18);
        linkedList.display();
        System.out.println();
        linkedList.remove(30);
        linkedList.display();

    }
}
