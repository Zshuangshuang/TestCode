public class OracleFactory implements DBFactory{
    @Override
    public MysqlConnection createConnection() {
        return new MysqlConnection();
    }

    @Override
    public MysqlStatement createStatement() {
        return new MysqlStatement();
    }
}
