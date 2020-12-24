package design.singleton;

/**
 *<p>
 * Enum implemented singleton,innate singleton,implemented
 * singleton is a good choice
 *</p>
 *
 * @author KChaste Sun
 *
 */
public class EnumSingleton {

    private EnumSingleton(){}

    private enum Singleton{
        /**
         * Unique instance
         */
        INSTANCE;

        private final EnumSingleton enumSingleton;

        Singleton() {
            this.enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstance(){
            return enumSingleton;
        }
    }
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

}
