package facade;

public class EncryptFacade {
    private FileReader reader;
    private FileWriter writer;
    private CipherMachine cipher;

    public EncryptFacade() {
        reader = new FileReader();
        writer = new FileWriter();
        cipher = new CipherMachine();
    }
    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(fileNameSrc, fileNameDes);
    }
}
