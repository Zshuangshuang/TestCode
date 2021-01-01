import java.io.File;

/**
 * Author:ZouDouble
 * Description:主要是明白File基本构造方法有哪些，可以实现遍历带目录的文件
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-01-01 11:31
 */
public class IODemo {
    //遍历文件夹
    private static void listAllFiles(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files){
                listAllFiles(f);
            }
        }else {
            System.out.println(file);
        }
    }
    public static void main(String[] args) {
        File file = new File("d:/test");
        System.out.println("是否为简单文件："+file.isFile());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否存在："+file.exists());
        listAllFiles(file);
    }
}
