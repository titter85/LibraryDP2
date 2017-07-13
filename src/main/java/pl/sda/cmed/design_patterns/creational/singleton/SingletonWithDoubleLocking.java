package pl.sda.cmed.design_patterns.creational.singleton;


public class SingletonWithDoubleLocking {
    private static SingletonWithDoubleLocking instance;

    public static SingletonWithDoubleLocking getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (SingletonWithDoubleLocking.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleLocking();
                }
            }
        }
        return instance;
    }
}
