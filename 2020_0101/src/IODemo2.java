import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:ZouDouble
 * Description:实现拷贝字节流文件
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-01-01 11:36
 */
public class IODemo2 {
    private static void myCopyFile(String srcPath,String destPath) throws IOException {
        //1、创建InputStream/outPutStream对象
        FileInputStream fileInputStream = new FileInputStream(srcPath);
        FileOutputStream fileOutputStream = new FileOutputStream(destPath);
        //2、将二进制文件信息读入fileInputStream
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len=fileInputStream.read(buffer)) != -1){
            //将读到的文件写入fileOutPutStream
            fileOutputStream.write(buffer,0,len);
        }
        //关闭资源，防止资源泄露
        fileInputStream.close();
        fileOutputStream.close();

    }
    public static void main(String[] args)throws IOException {
        myCopyFile("d:/test/lover.jpg","d:/test/lover3.jpg");
    }
}
