package 外观模式;


public class Test {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("123","C://password");
    }
}
