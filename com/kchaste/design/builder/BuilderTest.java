package com.kchaste.design.builder;

/**
 * @see StringBuilder#append(int)
 * @see StringBuffer#append(int)
 * @author KChaste Sun
 */
public class BuilderTest {

    public static void main(String[] args) {
        House house = new House.Builder().houseName("house name").houseSize("130").builder();
        System.out.println("house = " + house);
    }

}
