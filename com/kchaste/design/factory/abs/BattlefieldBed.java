package com.kchaste.design.factory.abs;

/**
 * @author KChaste Sun
 */
public class BattlefieldBed implements Bed {
    @Override
    public void getSize() {
        System.out.println("very big");
    }

    @Override
    public void getColor() {
        System.out.println("blue");
    }
}
