package design.bridge;

/**
 * @author KChaste Sun
 */
public class RedisConnection implements Connection {

    @Override
    public void setAutoCommit() {
        System.out.println("redis autoCommit modify");
    }

}
