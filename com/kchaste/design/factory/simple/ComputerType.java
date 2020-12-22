package com.kchaste.design.factory.simple;

import java.util.function.Supplier;

/**
 *
 * Differentiate computer type
 *
 * @author KChaste Sun
 */
public enum ComputerType {
    /**
     * lenovo computer
     */
    LENOVO(LenovoComputer::new),
    /**
     * dell computer
     */
    DELL(DellComputer::new);

    private final Supplier<Computer> supplier;

    ComputerType(Supplier<Computer> computerSupplier){
        this.supplier = computerSupplier;
    }

    public Supplier<Computer> getComputerSupplier(){
        return this.supplier;
    }
}
