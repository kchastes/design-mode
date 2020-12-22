package com.kchaste.design.factory.abs;

/**
 * @author KChaste Sun
 */
public class HouseTest {

    private enum HouseType{
        /**
         * battlefield style
         */
        BATTLEFIELD,
        /**
         * rural style
         */
        RURAL
    }
    public static HouseFactory factorySelect(HouseType type){
        switch (type){
            case RURAL:
                return new RuralHouseFactory();
            case BATTLEFIELD:
                return new BattlefieldHouseFactory();
            default:
                throw new RuntimeException("no such type...");
        }
    }
    public static void main(String[] args) {
        // product battlefield style house
        House house = HouseTest.factorySelect(HouseType.BATTLEFIELD).createHouse();
        house.getBed().getColor();
    }

}
