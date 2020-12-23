package com.kchaste.design.bridge;

/**
 * @author KChaste Sun
 */
public class OracleDriver implements Driver {

    private Connection connection;

    public OracleDriver(){}
    public OracleDriver(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void print() {
        System.out.println("this is oracle driver...");
    }

    @Override
    public Connection getConn() {
        return connection;
    }
}
