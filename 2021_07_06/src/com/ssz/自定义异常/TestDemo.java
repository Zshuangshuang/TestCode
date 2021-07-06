package com.ssz.自定义异常;

/**
  注意：自定义异常必须要继承一个父类
 */
class MyException extends ArithmeticException{
    public MyException() {
        super();
    }
    public MyException(String message){
        super(message);
    }

}
public class TestDemo {
    public static void  func() throws MyException{
        int x =20;
        if (x == 20){
            throw new MyException("自定义异常");
        }

    }
    public static void main(String[] args) {
        try {
            func();
        }catch (MyException e){
            e.printStackTrace();
            System.out.println("捕获到自定义异常");
        }
    }
}
