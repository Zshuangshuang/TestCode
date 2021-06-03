package 抽象工厂;


public class OracleStatement implements Statement{
    @Override
    public void getStatement() {
        System.out.println("This is OracleStatement");
    }
}
