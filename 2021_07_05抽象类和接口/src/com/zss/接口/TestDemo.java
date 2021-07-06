package com.zss.接口;

interface Shape{
     void draw();
}
class Flower implements Shape{
    @Override
    public void draw() {
        System.out.println("画❀❀");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("画△");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Triangle();
        drawMap(shape1);
        drawMap(shape2);
    }
}
