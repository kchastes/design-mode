package design.bridge;

/**
 * @author KChaste Sun
 */
public interface Driver {

    /**
     * print info
     */
    void print();

    /**
     * get connection
     * @return Connection instance
     */
    Connection getConn();
}
