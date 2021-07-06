package com.zss.抽象类;

abstract class Shape{
  /*  //普通方法
    public void func(){

    }
    //普通成员变量
    public int age;
    //抽象方法*/
    public abstract void draw();
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画朵❀❀");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("画个△");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("画个○");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Circle();
        drawMap(shape1);
        drawMap(shape2);
    }
}
