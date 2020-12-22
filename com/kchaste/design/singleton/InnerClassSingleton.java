package com.kchaste.design.singleton;

/**
 * <p>
 *  This way of doing it relative simpler
 * </p>
 *
 *
 * @author KChaste Sun
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class SingletonHelper{
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
