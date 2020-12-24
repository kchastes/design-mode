package design.factory.abs;

/**
 * Battlefield style house factory
 *
 * @author KChaste Sun
 */
public class BattlefieldHouseFactory implements HouseFactory{
    private Door door;
    private Bed bed;

    public BattlefieldHouseFactory() {
        this.bed = new BattlefieldBed();
        this.door = new BattlefieldDoor();
    }

    public BattlefieldHouseFactory(Door door, Bed bed) {
        this.door = door;
        this.bed = bed;
    }

    @Override
    public House createHouse() {
        return new House(door,bed);
    }
}
