package 抽象工厂;


public interface DBFactory {
    MySQLConnection createConnection();
    MySQLStatement createStatement();
}
