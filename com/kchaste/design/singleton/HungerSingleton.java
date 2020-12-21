package com.kchaste.design.singleton;

/**
 * @author KChaste Sun
 *
 * hunger singleton
 *
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

    /**
     *  private default constructor
     */
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


    public static void main(String[] args) {
        HungerSingleton instance = HungerSingleton.getInstance();
        HungerSingleton instanceTwo = HungerSingleton.getInstance();
        System.out.println("instance.getName() = " + instance.getName());
        System.out.println("instanceTwo.getName() = " + instanceTwo.getName());
        instance.setName("KChaste Sun");
        System.out.println("after modify the instance...");
        System.out.println("instance.getName() = " + instance.getName());
        System.out.println("instanceTwo.getName() = " + instanceTwo.getName());
    }
}
