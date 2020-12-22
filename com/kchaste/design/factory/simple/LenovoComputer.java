package com.kchaste.design.factory.simple;

/**
 *
 * This is a Lenovo computer
 *
 * @author KChaste Sun
 */
public class LenovoComputer implements Computer{

    @Override
    public void getName() {
        System.out.println("Lenovo");
    }

    @Override
    public void getColor() {
        System.out.println("Blue");
    }
}
