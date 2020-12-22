package com.kchaste.design.factory.abs;

/**
 * @author KChaste Sun
 */
public class RuralBed implements Bed {
    @Override
    public void getSize() {
        System.out.println("very short");
    }

    @Override
    public void getColor() {
        System.out.println("green");
    }
}
