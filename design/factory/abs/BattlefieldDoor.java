package design.factory.abs;

/**
 *
 * Possess Battlefield style door
 *
 * @author KChaste Sun
 */
public class BattlefieldDoor implements Door {
    @Override
    public void getName() {
        System.out.println("lightning");
    }

    @Override
    public void getColor() {
        System.out.println("blue");
    }

    @Override
    public void getBrand() {
        System.out.println("angle");
    }
}
