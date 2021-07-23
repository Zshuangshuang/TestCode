package com.zss.多线程;

class Person implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("每天都要开心");
        }
        System.out.println("100岁了，GoodBye world");
    }
}
class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("上帝每天保佑人类");
        }
    }
}
public class TestDemon {
    public static void main(String[] args) {
        Person person = new Person();
        God god = new God();
        Thread thread = new Thread(person);
        Thread thread1 = new Thread(god);
        thread1.setDaemon(true);//一般的线程默认为用户线程，要通过这个方法将线程设置为守护线程
        thread.start();
        thread1.start();
    }
}
