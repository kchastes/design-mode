package design.singleton;

/**
 * Use Synchronized method solve {@link SimpleLazySingleton} problem.
 *
 * <p>
 * But in this way {@link #getInstanceSyncMethod()} performance is not good,whether
 * this instance is empty or not,everyone thread have to wait last lock the thread.
 * </p>
 *
 * <p>
 * {@link #getInstanceSyncBlock()} Use double check guarantee only one instance.
 *  attribute add volatile guarantee get instance don't wrong.You can look <em>JVM</em>
 *  and <code>volatile</code> documentation
 * </p>
 *
 * @author KChaste Sun
 */
public class SyncLazySingleton {

    /**
     * {@linkplain SyncLazySingleton#getInstanceSyncMethod() getInstanceSyncMethod} with no need for volatile
     */
    private static volatile SyncLazySingleton syncLazySingleton;

    private String name;

    private SyncLazySingleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized static SyncLazySingleton getInstanceSyncMethod() {
        if (syncLazySingleton == null) {
            syncLazySingleton = new SyncLazySingleton("KChaste");
        }
        return syncLazySingleton;
    }

    public static SyncLazySingleton getInstanceSyncBlock() {
        if (syncLazySingleton == null) {
            synchronized (SyncLazySingleton.class) {
                if (syncLazySingleton == null){
                    syncLazySingleton = new SyncLazySingleton("KChaste");
                }
            }
        }
        return syncLazySingleton;
    }

}
