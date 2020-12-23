package com.kchaste.design.factory.simple;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * Computer factory
 * @see Calendar#getInstance()
 * @author KChaste Sun
 */
public class ComputerFactory {

    public Computer getComputer(ComputerType type){
        return type.getComputerSupplier().get();
    }

}
