class Node{
    public Node next;
    public Node prev;
    public int data;

    public Node(int data) {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
public class MyDoubleLinkedList {
    public Node head;
    public Node tail;
    public void addFirst(int data){
        Node node = new Node(data);
        //第一次插入,头和尾均指向新节点
        if (this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    private Node searchIndex(int index){
        Node cur = this.head;
        while(index > 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int pos,int data){
        if (pos < 0 || pos > size()){
            return;
        }
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node cur = searchIndex(pos);
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
    public Integer remove(int key){
        Node cur = this.head;

        while(cur != null){
            if (cur.data == key){
                int toRemove = cur.data;
                if (cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        //删除尾巴节点
                        this.tail = cur.prev;
                    }

                }
                 return toRemove;
            }

                cur = cur.next;

        }
       return null;
    }
public void removeAllKey(int keys){
    Node cur = this.head;
    while(cur != null){
        if (cur.data == keys){
            if (cur == this.head){
                this.head = this.head.next;
                if (this.head != null){
                    this.head.prev = null;
                }

            }else {
                cur.prev.next = cur.next;
                if (cur.next != null){
                    cur.next.prev = cur.prev;
                }else {
                    //删除尾巴节点
                    this.tail = cur.prev;
                }
            }
        }
    cur = cur.next;
    }
}
public void clear(){

        while(this.head != null){
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
}
    public static void main(String[] args) {
        MyDoubleLinkedList linkedList = new MyDoubleLinkedList();
        linkedList.addLast(20);
        linkedList.addLast(20);
        linkedList.addLast(20);
        linkedList.addLast(50);
        linkedList.addFirst(99);
        linkedList.display();
        System.out.println();
        /*linkedList.addIndex(3,66);
        linkedList.display();
        System.out.println();*/
        linkedList.removeAllKey(20);
        linkedList.display();
    }
}
