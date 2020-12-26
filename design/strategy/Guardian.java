package design.strategy;
/**
 * @author KChaste Sun
 */
public class Guardian {

    private Weapon weapon;

    public Guardian(Weapon weapon){
        this.weapon = weapon;
    }
    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void attack(){
        weapon.execute();
    }
}
