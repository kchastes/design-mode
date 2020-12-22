package com.kchaste.design.factory.simple;

/**
 *
 * This is a Dell computer...
 *
 * @author KChaste Sun
 */
public class DellComputer implements Computer{
    @Override
    public void getName() {
        System.out.println("Dell");
    }

    @Override
    public void getColor() {
        System.out.println("black");
    }
}
