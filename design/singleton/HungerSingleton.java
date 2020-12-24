package design.singleton;

/**
 * Hunger singleton.
 * You can by {@link #getInstance()} get instance proceed test
 *
 * @see Runtime#getRuntime()
 * @author KChaste Sun
 */
public class HungerSingleton {
    /**
     * instance attribute
     */
    private String name;

    /**
     * default instance
     */
    private static final HungerSingleton HUNGER_SINGLETON = new HungerSingleton("KChaste");

    private HungerSingleton(String name){
        this.name = name;
    }

    /**
     * only get HungerSingleton instance static method
     * @return {@link HungerSingleton} instance
     */
    public static HungerSingleton getInstance(){
        return HUNGER_SINGLETON;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
