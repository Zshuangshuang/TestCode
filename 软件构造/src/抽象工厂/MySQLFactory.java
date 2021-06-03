package 抽象工厂;


public class MySQLFactory implements DBFactory{
    @Override
    public MySQLConnection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public MySQLStatement createStatement() {
        return new MySQLStatement();
    }
}
