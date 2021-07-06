package com.ssz.异常;

public class TestDemo {
    public static int func(){
        int[] arr = {2,9,10};
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            //打印异常信息栈
            e.printStackTrace();
            System.out.println("捕获到数组下标越界异常");
            return 10;
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕获到空指针异常");
        }finally {
            System.out.println("finally语句块中的代码一定会被执行");
            return 99;//一定会被执行
        }
    }
    public static void main(String[] args) {
        System.out.println(func());//输出99
    }
}
