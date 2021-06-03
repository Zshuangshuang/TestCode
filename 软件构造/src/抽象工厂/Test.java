package 抽象工厂;


public class Test {
    public static void main(String[] args) {
        System.out.println("Mysql产品");
        MySQLFactory mySQLFactory = new MySQLFactory();
        Connection mysqlConnection = mySQLFactory.createConnection();
        Statement mysqlStatement = mySQLFactory.createStatement();
        mysqlConnection.getConnection();
        mysqlStatement.getStatement();
        System.out.println("Oracle产品");
        OracleFactory oracleFactory = new OracleFactory();
        Connection oracleConnection = oracleFactory.createConnection();
        Statement oracleStatement = oracleFactory.createStatement();
        oracleConnection.getConnection();
        oracleStatement.getStatement();
    }
}
