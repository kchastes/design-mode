package com.kchaste.design.factory.simple;

/**
 *
 * Computer factory
 *
 * @author KChaste Sun
 */
public class ComputerFactory {

    public Computer getComputer(ComputerType type){
        return type.getComputerSupplier().get();
    }

}
