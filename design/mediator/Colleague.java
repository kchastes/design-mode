package design.mediator;
/**
 * @author KChaste Sun
 */
public abstract class Colleague {

    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
