package com.zss.多线程.死锁;

class Mirror{

}
class Lipstick{

}
class Makeup extends Thread{
    //保证镜子的口红只有一份
    static Mirror mirror = new Mirror();
    static Lipstick lipstick = new Lipstick();
    public int choose;
    public String girlName;
    public Makeup(int choose,String girlName){
        this.choose = choose;
        this.girlName = girlName;
    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void makeup() throws InterruptedException {
        if (choose == 0){
            synchronized (lipstick){
                System.out.println(girlName+"获得口红的锁");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(girlName+"获得镜子的锁");
                }
            }

        }else {
            synchronized (mirror){
                System.out.println(girlName+"获得镜子的锁");
                Thread.sleep(2000);
                synchronized (lipstick){
                    System.out.println(girlName+"获得口红的锁");
                }
            }


        }
    }
}
public class DeadLock {

    public static void main(String[] args) {
        Makeup a = new Makeup(0,"灰姑娘" );
        Makeup b = new Makeup(1,"白雪公主");
        a.start();
        b.start();
    }
}
