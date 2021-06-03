package 外观模式;

public class FileWriter {
    public void write(String encryptText,String fileNameDes){
        System.out.println("文件内容: "+encryptText+" "+"文件路径: "+fileNameDes);
    }
}
