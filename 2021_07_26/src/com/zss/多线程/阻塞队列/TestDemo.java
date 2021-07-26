package com.zss.多线程.阻塞队列;

class BlockingQueue{
    public int[] array = new int[100];
    public int head;
    public int tail;
    public int size;
    public void put(int x){
       synchronized (this){
          while (size == array.length){
               try {
                   //使用wait的时候建议使用while
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           array[tail] = x;
           tail++;
           if (tail == array.length){
               tail = 0;
           }
           size++;
           notify();
       }
    }
    public int take(){
        synchronized (this){
            while (size == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int ret = array[head];
            head++;
            if (head == array.length){
                head = 0;
            }
            size--;
            notify();
            return ret;
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        BlockingQueue queue = new BlockingQueue();
        Thread producer = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    queue.put(i);
                    System.out.println("生产者生产："+i);
                }
            }
        };
        producer.start();
        Thread customer = new Thread(){
            @Override
            public void run() {
                while(true){
                    int ret = queue.take();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("消费者消费： "+ret);
                }
            }
        };
        customer.start();
    }
}
