package com.zss.多线程.定时器;

import java.util.concurrent.PriorityBlockingQueue;

class Task implements Comparable<Task>{
    public Runnable command;
    public long after;

    public Task(Runnable command, long after) {
        this.command = command;
        this.after = System.currentTimeMillis()+after;
    }
    public void run(){
        command.run();
    }

    @Override
    public int compareTo(Task o) {
        return (int)(this.after-o.after);
    }
}
class Worker extends Thread {
    private PriorityBlockingQueue<Task> queue = null;
    private Object mailbox = null;

    public Worker(PriorityBlockingQueue<Task> queue, Object mailbox) {
        this.queue = queue;
        this.mailbox = mailbox;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Task task = queue.take();

                long curTime = System.currentTimeMillis();
                if (task.after > curTime) {
                    queue.put(task);
                    synchronized (mailbox) {
                        try {
                            mailbox.wait(task.after - curTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    task.run();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
class Timer {
    public Object mailbox = new Object();
    public PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

    public Timer() {
        Worker worker = new Worker(queue,mailbox);
        worker.run();
    }
    public void schedule(Runnable command,long time){
        Task task = new Task(command,time);
        queue.put(task);
        synchronized (mailbox){
            mailbox.notify();
        }
    }
}

public class TestDemo {
    public static void main(String[] args) {

    }
}
