package com.zss.堆.优先级队列;


public class MyPriorityQueue {
    public int[] array = new int[100];
    public  int size = 0;
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
    public  int poll(){
        int result = array[0];
        array[0] = array[size-1];
        size--;
        shiftDown(array,size,0);
        return result;
    }

    private  void shiftDown(int[] array, int size, int index) {
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
        return size==0;
    }

    public static void main(String[] args) {
        MyPriorityQueue priorityQueue = new MyPriorityQueue();
        priorityQueue.offer(9);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(7);
        priorityQueue.offer(3);
        priorityQueue.offer(6);
        priorityQueue.offer(8);
        while (!priorityQueue.isEmpty()){
            int cur = priorityQueue.poll();
            System.out.print(cur+" ");
        }
    }
}
