package com.zss.多线程;

/**
 * 多线程模拟实现龟兔赛跑
 * */
public class Race implements Runnable{
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 500; i++) {
            if (Thread.currentThread().getName().equals("兔子") && i%100 == 0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (isGameOver(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
        }
    }
    private boolean isGameOver(int meters){
        if (winner != null){
            return true;
        }{
            if (meters >= 500){
                winner = Thread.currentThread().getName();
                System.out.println(winner+"赢得比赛");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
