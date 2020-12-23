package com.kchaste.design.bridge;

/**
 * @author KChaste Sun
 */
public class RedisDriver implements Driver {

    private Connection connection;

    public RedisDriver(){}

    public RedisDriver(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void print() {
        System.out.println("this is redis driver");
    }
    @Override
    public Connection getConn() {
        return connection;
    }
}
