package com.kchaste.design.property;

/**
 * @author KChaste Sun
 */
public class HouseClone {

    public static void main(String[] args) {
        House house = new House();
        house.setColor("green");
        house.setName("KChaste Sun");
        System.out.println(house);
        House clone = (House) house.clone();
        clone.setName("modify");
        System.out.println("clone-->"+clone);
        System.out.println("house--->"+house);
    }

}
