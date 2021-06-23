package com.zss.homework;

/*
* 输出乘法口诀表
 * */
public class Demo5 {
    public static void show(){
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                int ret = row * col;
                System.out.print(col+"*"+row+"="+ret+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        show();
    }
}
