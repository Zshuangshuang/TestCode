package Main;


import facade.EncryptFacade;

public class FacadeMain {
    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt("你好","外观者模式");
    }
}
