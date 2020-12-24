package design.flyweight;

/**
 * @author KChaste Sun
 */
public class UnsharedConcreteFlyweight {

    private String name;

    public UnsharedConcreteFlyweight() {
    }

    public UnsharedConcreteFlyweight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
