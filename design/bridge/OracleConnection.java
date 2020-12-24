package design.bridge;

/**
 * @author KChaste Sun
 */
public class OracleConnection implements Connection {


    @Override
    public void setAutoCommit() {
        System.out.println("oracle autoCommit modify");
    }
}
