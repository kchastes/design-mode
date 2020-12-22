package com.kchaste.design.factory.abs;

/**
 *
 * Rural style house factory
 * @author KChaste Sun
 */
public class RuralHouseFactory implements HouseFactory {
    private Door door;
    private Bed bed;

    public RuralHouseFactory() {
        this.bed = new RuralBed();
        this.door = new RuralDoor();
    }

    public RuralHouseFactory(Door door, Bed bed) {
        this.door = door;
        this.bed = bed;
    }

    @Override
    public House createHouse() {
        return new House(door,bed);
    }
}
