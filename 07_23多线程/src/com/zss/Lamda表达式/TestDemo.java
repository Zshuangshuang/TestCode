package com.zss.Lamda表达式;

interface ISmile{
    void laugh(String name);
}
public class TestDemo {
    public static void main(String[] args) {
     /*   ISmile smile = new ISmile() {
            @Override
            public void laugh(String name) {
                System.out.println(name+"正在开心的😀");
            }
        };
        smile.laugh("小短腿");*/
        ISmile smile = name -> {
            System.out.println(name+"正在开心的😀");
        };
        smile.laugh("妹妹");
    }
}
