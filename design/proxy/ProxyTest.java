package design.proxy;

/**
 * @author KChaste Sun
 */
public class ProxyTest {

    public static void main(String[] args) {
        Garden garden = new GardenSteward(new PrincessGarden());
        garden.rose();
    }

}
