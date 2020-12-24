package design.factory.abs;

/**
 * @author KChaste Sun
 */
public class RuralDoor implements Door {
    @Override
    public void getName() {
        System.out.println("rural name");
    }

    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void getBrand() {
        System.out.println("fly");
    }
}
