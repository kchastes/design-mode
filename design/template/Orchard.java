package design.template;
/**
 * @author KChaste Sun
 */
public abstract class Orchard {


    abstract void seed();

    public void result(){
        System.out.println("harvest");
    }

    public void watering(){
        System.out.println("watering....");
    }

    public void execute(){
        seed();
        watering();
        result();
    }
}
