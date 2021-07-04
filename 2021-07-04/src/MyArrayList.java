
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[100];
        this.usedSize = 0;
    }
    public void addFirst(int data){
        for (int i = this.usedSize; i > 0; i--) {
            this.elem[i] = this.elem[i-1];
        }
        this.elem[0] = data;
        this.usedSize++;
    }
    public void addLast(int data){
        this.elem[usedSize] = data;
        this.usedSize++;
    }
    public int findPos(int data){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == data){
                return i;
            }
        }
        return -1;
    }
    public void addPos(int pos,int data){
        if (pos < 0 || pos > this.usedSize){
            return;
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    public void remove(int data){
        int ret = findPos(data);
        if (ret == -1){
            System.out.println("没有你要删除的元素");
        }
        for (int i = ret; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addLast(20);
        myArrayList.addLast(30);
        myArrayList.addLast(40);
        myArrayList.display();
        myArrayList.addFirst(10);
        myArrayList.display();
        /*myArrayList.remove(20);
        myArrayList.display();*/
        myArrayList.addPos(3,99);
        myArrayList.display();
    }
}
