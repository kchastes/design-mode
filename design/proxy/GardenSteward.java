package design.proxy;

/**
 * @author KChaste Sun
 */
public class GardenSteward implements Garden{

    private Garden garden;
    public GardenSteward(){}
    public GardenSteward(Garden garden){
        this.garden = garden;
    }

    @Override
    public void rose() {
        System.out.println("Cultivation of flower seeds");
        garden.rose();
        System.out.println("maintain");
    }
}
