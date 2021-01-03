import java.io.*;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-01-03 11:54
 */
class Teacher implements Serializable {
    public String name;
    public int age;
    public int salary;

}
public class IODemo2 {
    private static Teacher deSerializable() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:teacher.txt"));
        Teacher teacher = (Teacher) objectInputStream.readObject();
        return teacher;
    }
    private static void serializable(Teacher teacher) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:/teacher.txt"));
        objectOutputStream.writeObject(teacher);
        objectOutputStream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = deSerializable();
        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.salary);
       /* teacher.name = "董老师";
        teacher.age = 30;
        teacher.salary = 5000;
        serializable(teacher);*/
    }
}
