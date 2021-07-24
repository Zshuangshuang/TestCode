package com.zss.多线程.锁;

import java.util.Scanner;

class Count{
    public volatile int val = 0;
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Count count = new Count();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                /**
                 * 反复执行的这段代码主要有两个操作：
                 * (1)从内存中读取val的值到CPU上
                 * (2)将CPU上的值和0进行比较
                 * 从内存上读取数据的速度优于从磁盘上读取数据，从CPU上读取数据的速率优于从内存上读取数据，大概是3-4个数量级
                 * 正因为如此，编译器认为这个循环也没干啥，就是从内存中读取数据，于是就把这个读内存的操作优化了
                 * 第一次从内存中将数据读取到CPU后，后续就直接从CPU上读取数据(并不是真正的从内存中读取数据)
                 * 编译器认为val没有改动，它不能感知其他线程是否对val进行了修改
                 * */
                while (count.val == 0){

                }
                System.out.println("线程1执行完毕");
            }
        };
        t1.start();;
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个数字");
                count.val = scanner.nextInt();
            }
        };
        t2.start();
    }
}
