package 抽象工厂;


public class MySQLConnection implements Connection{
    @Override
    public void getConnection() {
        System.out.println("This is MySQLConnection");
    }
}
