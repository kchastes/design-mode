package com.kchaste.design.builder;

/**
 *
 * @author KChaste Sun
 */
public class BuilderTest {

    public static void main(String[] args) {
        House house = new House.Builder().houseName("house name").houseSize("130").builder();
        System.out.println("house = " + house);
    }

}
