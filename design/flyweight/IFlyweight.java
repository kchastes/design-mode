package design.flyweight;

/**
 * @author KChaste Sun
 */
public interface IFlyweight {

    /**
     * UnsharedConcreteFlyweight operation
     * @param unsharedConcreteFlyweight instance
     */
    void setOperation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
