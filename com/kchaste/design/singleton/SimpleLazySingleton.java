package com.kchaste.design.singleton;

/**
 * Simple lazy singleton
 *
 * Though this possess lazy load of function,But there
 * {@link #getInstance()} concurrency or other problem.
 *
 *
 * This also Class name is 'simple' reason.
 *
 * @author KChaste Sun
 */
public class SimpleLazySingleton {

    private static SimpleLazySingleton simpleLazySingleton;

    private String name;

    private SimpleLazySingleton(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SimpleLazySingleton getInstance(){
        if (simpleLazySingleton == null){
            simpleLazySingleton = new SimpleLazySingleton("KChaste");
        }
        return simpleLazySingleton;
    }
}
