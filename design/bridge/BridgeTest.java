package design.bridge;

/**
 * @author KChaste Sun
 */
public class BridgeTest {

    public static void main(String[] args) {
        OracleDriver oracleDriver = new OracleDriver(new OracleConnection());
        Connection conn = oracleDriver.getConn();
        conn.setAutoCommit();
    }


}
