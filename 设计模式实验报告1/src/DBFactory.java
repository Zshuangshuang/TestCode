public interface DBFactory {
    MysqlConnection createConnection();
    MysqlStatement createStatement();
}
