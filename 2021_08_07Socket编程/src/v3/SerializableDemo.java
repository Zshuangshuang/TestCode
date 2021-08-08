package v3;


import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) {
   /*     User user1 = new User(1,"邹双","女");
        User user2 = new User(2,"肖一凡","男");*/

        //将user1和user2进行序列化写入文件
        String filename = "E:\\JavaCode\\TestCode\\2021_08_07Socket编程\\sessions\\users.obj";
     /*   try(OutputStream outStream = new FileOutputStream(filename)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);
            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);
            objectOutputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }*/
        try(InputStream inputStream = new FileInputStream(filename)){
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Object user1 = (User)objectInputStream.readObject();
            Object user2 = (User)objectInputStream.readObject();
            System.out.println("user1："+user1);
            System.out.println("user2："+user2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
