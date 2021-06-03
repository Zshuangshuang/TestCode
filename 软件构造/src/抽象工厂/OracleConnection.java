package 抽象工厂;


public class OracleConnection implements Connection{
    @Override
    public void getConnection() {
        System.out.println("This is OracleConnection");
    }
}
