package design.flyweight;

/**
 * @author KChaste Sun
 */
public class ConcreteFlyweight implements IFlyweight{

    private String key;

    public ConcreteFlyweight() {
    }

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void setOperation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("unShared info");
    }
}
