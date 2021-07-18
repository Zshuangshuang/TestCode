package com.zss.优先级队列;

/**
 * 所谓优先级队列，主要分为两个操作：
 * （1）入队列，直接将元素插入到堆尾，然后进行向上调整
 * (2)出队列，将堆中的最后一个元素放到堆顶，然后进行向下调整
 * */
public class MyPriorityQueue {
    public int[] array = new int[100];
    public int size = 0;
    public  void offer(int x){
        array[size] = x;
        size++;
        shiftUp(array,size-1);
    }

    private void shiftUp(int[] array, int index) {
        int child = index;
        int parent = (child-1)/2;
        while (child > 0){
            if (array[parent] < array[child]){
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }else {
                break;
            }
            child = parent;
            parent = (child-1)/2;
        }
    }
    public int poll(){
        int result = array[0];
        array[0] = array[size-1];
        size--;
        shiftDown(array,size,0);
        return result;
    }

    private void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2*parent + 1;
        while (child < size){
            if (child+1 < size && array[child+1] < array[child]){
                child = child+1;
            }
            if (array[child] < array[parent]){
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            }else {
                break;
            }
            parent = child;
            child = 2*parent +1;

        }

    }
    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
