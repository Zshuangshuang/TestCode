class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    public void display(){
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    private Node findPre(int index){
       Node pre = head;
       while (index -1 > 0 && pre != null){
           pre = pre.next;
           index--;
       }
        return pre;
    }
    public void addIndex(int index,int key){
        if (index < 0 ){
            return;
        }
        if (index == 0){
            addFirst(key);
            return;
        }
        if (index == size()){
            addLast(key);
        }
        Node pre = findPre(index);
        if (pre == null){
            System.out.println("当前位置不合法");
            return;
        }
        Node node = new Node(key);
        node.next = pre.next;
        pre.next = node;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.addFirst(99);
        myLinkedList.addLast(40);
        myLinkedList.display();
        myLinkedList.addIndex(1,100);
        myLinkedList.display();
    }
}
