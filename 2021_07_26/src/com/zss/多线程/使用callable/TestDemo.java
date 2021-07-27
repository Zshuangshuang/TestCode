package com.zss.多线程.使用callable;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int ret = 0;
                for (int i = 0; i <= 100; i++) {
                    ret += i;
                }
                return ret;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        //get方法是阻塞的，一直等到真正的结果计算出来才会返回
        Integer result = futureTask.get();
        System.out.println(result);
    }
}
