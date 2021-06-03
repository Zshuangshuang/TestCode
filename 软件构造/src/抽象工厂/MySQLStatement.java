package 抽象工厂;


public class MySQLStatement implements Statement{
    @Override
    public void getStatement() {
        System.out.println("This is MySQLStatement");
    }
}
