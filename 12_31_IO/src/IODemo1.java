import java.io.File;
import java.io.IOException;

/**
 * Author:ZouDouble
 * Description:IOException:受查异常
 * 天气：晴天
 * 目标：Good Offer
 * Date    2020-12-31 21:30
 */
public class IODemo1 {
    public static void main(String[] args) throws IOException {
      /*  //此处是绝对路径
        File file = new File("d:/test.txt");
        System.out.println("文件是否存在:"+file.exists());
        System.out.println("当前文件是不是普通文件："+file.isFile());
        System.out.println("当前文件是不是目录:"+file.isDirectory());
        file.createNewFile();*/
        //目录的创建
        File file = new File("d:/test_dir");
        /*System.out.println(file.exists());
        System.out.println(file.isDirectory());
        file.mkdirs();
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());*/
        ListAllFiles(file);
    }
    //地柜罗列一个文件夹里面的所有文件
    private static void ListAllFiles(File f){
        if (f.isDirectory()){
            File[] files = f.listFiles();
            for (File file : files){
               ListAllFiles(file);
            }
        }else {
            System.out.println(f);
        }
    }
}
