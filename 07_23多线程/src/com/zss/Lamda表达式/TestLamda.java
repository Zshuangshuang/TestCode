package com.zss.Lamda表达式;

interface IStudy{
    void learn(String name);
}
/*class Study implements IStudy{
    @Override
    public void learn(String name) {
        System.out.println(name+"好好学习1");
    }
}*/
public class TestLamda {
    //静态内部类
  /* static class Study implements IStudy{
        @Override
        public void learn(String name) {
            System.out.println(name+"好好学习1");
        }
    }*/

    public static void main(String[] args) {
        //局部内部类
       /* class Study implements IStudy{
            @Override
            public void learn(String name) {
                System.out.println(name+"好好学习2");
            }
        }*/
    /*    //匿名内部类
        IStudy study = new IStudy() {
            @Override
            public void learn(String name) {
                System.out.println(name + "好好学习");
            }
        };
        study.learn("Hello");*/
        //Study study = new Study();
        //study.learn("邹双双");
        //lamda表达式
       IStudy stu = name ->{
            System.out.println(name+"在学习");
        };
       stu.learn("MMM");
    }
}
