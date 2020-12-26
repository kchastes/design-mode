package design.strategy;

/**
 * @author KChaste Sun
 */
public class StrategyTest {


    public static void main(String[] args) {
        Guardian guardian = new Guardian(()-> System.out.println("knife attack"));
        guardian.attack();
        guardian.changeWeapon(()-> System.out.println("magic attack"));
        guardian.attack();
    }

}
