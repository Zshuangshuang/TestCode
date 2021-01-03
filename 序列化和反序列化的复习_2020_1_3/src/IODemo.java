import java.io.*;

/**
 * Author:ZouDouble
 * Description:序列化
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-01-03 11:38
 */
class Student implements Serializable {
   public String name;
   public int age;
   public int score;

}
public class IODemo {
    private static Student deSerializable() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:/student.txt"));
        Student  student = (Student) objectInputStream.readObject();
        return student;
    }
    private static void serializable(Student student) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:/student.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Student student = new Student();
        student.name = "初一";
        student.age = 19;
        student.score = 99;
        serializable(student);*/

        Student student = deSerializable();
        System.out.println("姓名："+student.name);
        System.out.println("年龄："+student.age);
        System.out.println("成绩："+student.score);
    }
}
