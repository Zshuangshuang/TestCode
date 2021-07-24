package com.zss.多线程.生产者消费者模型;

class Chicken{
    public int id;

    public Chicken(int id) {
        this.id = id;
    }
}
class Producer extends Thread{

    SYNPool synPool;
    public Producer(SYNPool synPool){
        this.synPool = synPool;
    }

    @Override
    public synchronized void start() {
        for (int i = 0; i < 100; i++) {
            try {
                synPool.push(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Customer extends Thread{
    SYNPool synPool;
    public Customer(SYNPool synPool){
        this.synPool = synPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Chicken chicken = synPool.pop();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SYNPool{
    Chicken[] chickens = new Chicken[10];
    int count = 0;
    public synchronized  void push(Chicken chicken) throws InterruptedException {
        //生产的产品达到上限，需要等一会儿
        if (count == chickens.length){
            this.wait();
        }
        chickens[count] = chicken;
        System.out.println("生产了"+chicken.id+"号鸡");
        count++;
        //通知消费者来吃鸡
        this.notifyAll();
    }
    public synchronized Chicken pop() throws InterruptedException {
        if (count == 0){
            this.wait();
        }
        count--;
        Chicken chicken = chickens[count];
        System.out.println("消费者消费了"+chicken.id+"只鸡");
        this.notifyAll();
        return chicken;
    }
}
public class PC {
    public static void main(String[] args) {
        Producer producer = new Producer(new SYNPool());
        Customer customer = new Customer(new SYNPool());
        producer.start();
        customer.start();
    }
}
