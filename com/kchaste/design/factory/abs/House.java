package com.kchaste.design.factory.abs;

/**
 *
 * house instance
 *
 * @author KChaste Sun
 */
public class House {
    private Door door;
    private Bed bed;

    House(){};
    public House(Door door, Bed bed) {
        this.door = door;
        this.bed = bed;
    }

    public Door getDoor() {
        return door;
    }
    public void setDoor(Door door) {
        this.door = door;
    }
    public Bed getBed() {
        return bed;
    }
    public void setBed(Bed bed) {
        this.bed = bed;
    }

}
