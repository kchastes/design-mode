package design.factory.abs;

import javax.xml.xpath.XPathFactory;

/**
 *
 * @see XPathFactory#newInstance()
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

    /**
     * house factory selector
     * instance ought to pass class path reflect create
     * @param type house style
     * @return house factory
     */
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
