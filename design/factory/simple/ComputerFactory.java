package design.factory.simple;

import java.util.Calendar;

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
